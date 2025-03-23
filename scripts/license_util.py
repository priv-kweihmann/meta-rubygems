# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2020, Konrad Weihmann

import hashlib
import json
import os
import re
import subprocess
import tempfile
import shutil


def __get_from_file(tarball):
    _lic_path = ""
    _lic_hash = ""
    _potential_files = [x for x in tarball.getnames() if re.match(
        r"^(.*/)*(license.*|copying.*|licence.*|.*-license)", x, re.IGNORECASE)]
    if _potential_files:
        try:
            _l = tarball.extractfile(_potential_files[0])
            _lic_path = os.path.join(
                "/tmp", os.path.basename(_potential_files[0]))
            with open(_lic_path, "wb") as o:
                o.write(_l.read())
            hash_md5 = hashlib.md5()
            with open(_lic_path, "rb") as f:
                for chunk in iter(lambda: f.read(4096), b""):
                    hash_md5.update(chunk)
            _lic_hash = hash_md5.hexdigest()
        except Exception:
            _lic_path = ""
            _lic_hash = ""
    return (os.path.basename(_lic_path), _lic_hash)


def __get_from_scancode(tarball, temp_folder, excludes):
    _dir = tempfile.mkdtemp()
    tarball.extractall(path=_dir)

    try:
        subprocess.check_call(
            ["scancode", "--license", "--strip-root", "--quiet", "--json",
             os.path.join(temp_folder.name, "scancode.res.json"), "-n", "8", _dir], stderr=subprocess.DEVNULL)
    except subprocess.CalledProcessError as e:
        print("scancode run failed: {}".format(e))

    res = {}
    if os.path.exists(os.path.join(temp_folder.name, "scancode.res.json")):
        with open(os.path.join(temp_folder.name, "scancode.res.json")) as i:
            j = json.load(i)
            for f in j["files"]:
                if any([re.match(x, f["path"]) for x in excludes]):
                    continue
                for license in f["license_detections"]:
                    for match in license["matches"]:
                        if f["path"] not in res:
                            res[f["path"]] = {"start": 99999999999, "end": -1}
                        res[f["path"]]["start"] = min(
                            res[f["path"]]["start"], match["start_line"])
                        res[f["path"]]["end"] = max(res[f["path"]]["end"], match["end_line"])

    _lic_path = ""
    _lic_hash = ""
    if res:
        for k, v in res.items():
            _lic_path = k
            hash_md5 = hashlib.md5()
            try:
                with open(os.path.join(_dir, _lic_path), "r") as f:
                    _lines = "".join(f.readlines()[v["start"] - 1:v["end"]])
                    hash_md5.update(_lines.encode('utf-8'))
                _lic_hash = hash_md5.hexdigest()
                _lic_path += ";beginline={};endline={}".format(v["start"], v["end"])
            except UnicodeDecodeError:
                print("License file {} is not readable".format(_lic_path))
                continue

    shutil.rmtree(_dir, ignore_errors=True)
    return (_lic_path, _lic_hash)


def get_license_info(tarball, temp_folder, excludes=[]):
    _lic_path, _lic_hash = __get_from_file(tarball)
    if _lic_path:
        return (_lic_path, _lic_hash)
    _lic_path, _lic_hash = __get_from_scancode(tarball, temp_folder, excludes)
    if _lic_path:
        return (_lic_path, _lic_hash)
    return ("TODO", None)
