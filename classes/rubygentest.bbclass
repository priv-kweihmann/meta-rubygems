## SPDX-License-Identifier: MIT
## Copyright (c) 2021, Konrad Weihmann

RUBYGEMS_AUTOGEN_TESTS ??= "0"

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
        return pn.replace("-", "_").replace(".", "_")

    _tpl_class = rubygem_load_template(d, "rubygems_testclass.template")
    _tpl_require = rubygem_load_template(d, "rubygems_testrequire.template")
    _tpl_gem = rubygem_load_template(d, "rubygems_testgemlist.template")
    _tpl_exec = rubygem_load_template(d, "rubygems_execwrapper.template")

    __tests = set()

    for _file in glob.glob(d.expand("${PKGDEST}/${PN}/${libdir}/ruby/gems/${GEMLIB_VERSION}/gems/*/lib/*.rb")):
        _filename, _ext = os.path.splitext(_file)
        _filename = os.path.basename(_filename)
        __tests.add(_tpl_require.format(
            pn=sanitize_name(d.getVar("BPN")),
            require=_filename,
            sanitize_name=sanitize_name(_filename).replace(".", "_")))

    for _file in glob.glob(d.expand("${PKGDEST}/${PN}/${bindir}/*")):
        _filename = os.path.basename(_file)
        __tests.add(_tpl_exec.format(
            sanitize_app=sanitize_name(_filename),
            exec=_filename))

    __tests.add(_tpl_gem.format(
        pn=sanitize_name(d.getVar("BPN")),
        gemname=d.getVar("GEM_NAME")))

    with open(d.expand("${RUBYGEMS_LAYERDIR}/lib/oeqa/runtime/cases/rubygems_%s.py" % sanitize_name(d.getVar("BPN"))), "w") as o:
        o.write(_tpl_class.format(
                    pn=sanitize_name(d.getVar("BPN")),
                    tests="\n\n".join(sorted(__tests))))
        o.write("\n")
}

do_rubygems_gen_test[doc] = "generate automatic test cases for rubygems"
do_rubygems_gen_test[vardepsexclude] += "RUBYGEMS_LAYERDIR"
addtask do_rubygems_gen_test after do_package before do_package_qa

python() {
    if d.getVar("RUBYGEMS_AUTOGEN_TESTS") == "1":
        d.setVarFlag("do_rubygems_gen_test", "nostamp", "1")
    else:
        d.setVarFlag("do_rubygems_gen_test", "noexec", "1")
}
