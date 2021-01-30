## SPDX-License-Identifier: MIT
## Copyright (c) 2021, Konrad Weihmann

def rubygem_load_template(d, name):
    try:
        with open(d.expand("${RUBYGEMS_LAYERDIR}/files/%s" % name), "r") as i:
            return i.read()
    except Exception:
        return ""

python do_rubygems_gen_test() {
    import glob
    import json

    def sanitize_name(pn):
        return pn.replace("-", "_")

    _tpl_class = rubygem_load_template(d, "rubygems_testclass.template")
    _tpl_require = rubygem_load_template(d, "rubygems_testrequire.template")
    _tpl_gem = rubygem_load_template(d, "rubygems_testgemlist.template")

    __tests = set()

    for _file in glob.glob(d.expand("${PKGDEST}/${PN}/${libdir}/ruby/gems/gems/*/lib/*.rb")):
        _filename, _ext = os.path.splitext(_file)
        _filename = os.path.basename(_filename)
        __tests.add(_tpl_require.format(
            pn=sanitize_name(d.getVar("BPN")),
            require=_filename,
            sanitize_name=sanitize_name(_filename)))

    __tests.add(_tpl_gem.format(
        pn=sanitize_name(d.getVar("BPN")),
        gemname=sanitize_name(d.getVar("GEM_NAME"))))

    with open(d.expand("${RUBYGEMS_LAYERDIR}/lib/oeqa/runtime/cases/rubygems_%s.py" % sanitize_name(d.getVar("BPN"))), "w") as o:
        o.write(_tpl_class.format(
                    pn=sanitize_name(d.getVar("BPN")),
                    tests="\n\n".join(sorted(__tests))))
        o.write("\n")
}

do_rubygems_gen_test[doc] = "generate automatic test cases for rubygems"
do_rubygems_gen_test[nostamp] = "1"
addtask do_rubygems_gen_test after do_package
