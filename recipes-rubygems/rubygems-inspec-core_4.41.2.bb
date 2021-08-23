# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-chef-telemetry-native \
    rubygems-faraday-middleware-native \
    rubygems-faraday-native \
    rubygems-hashie-native \
    rubygems-license-acceptance-native \
    rubygems-method-source-native \
    rubygems-mixlib-log-native \
    rubygems-multipart-post-native \
    rubygems-parallel-native \
    rubygems-parslet-native \
    rubygems-pry-native \
    rubygems-rspec-its-native \
    rubygems-rspec-native \
    rubygems-rubyzip-native \
    rubygems-semverse-native \
    rubygems-sslshake-native \
    rubygems-thor-native \
    rubygems-tomlrb-native \
    rubygems-train-core-native \
    rubygems-tty-prompt-native \
    rubygems-tty-table-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b5427e9aaffa11e5f6113f8639aa6f01"
SRC_URI[sha256sum] = "3d1b65855adcb8d4cf8336b5bb1e0c2e86063077e5257d497287ef5b10a9293a"

GEM_NAME = "inspec-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_gem_unpack() {
    export RUBYLIB=${RUBYLIB}

    cd ${WORKDIR}
    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem unpack -V ${GEM_FILE}
}

do_generate_spec() {
    export RUBYLIB=${RUBYLIB}
    export GEM_SPEC=${GEM_SPEC_CACHE}

    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem spec -V --ruby ${GEM_FILE} > ${GEM_SPEC_FILE}

    # lift the version bindings to be less strict
    if [ "${GEM_DISABLE_STRICT_VER}" -eq "1" ]; then
        sed -i 's#~>#>=#g' ${GEM_SPEC_FILE}
        sed -i 's#<=[[:space:]]*[0-9]\+\.[0-9]\+\.[0-9]\+#!=0#g' ${GEM_SPEC_FILE}
        sed -i 's#<[[:space:]]*[0-9]\+\.[0-9]\+\.[0-9]\+#!=0#g' ${GEM_SPEC_FILE}
        sed -i 's#<[[:space:]]*[0-9]\+\.[0-9]\+#!=0#g' ${GEM_SPEC_FILE}
    fi
}

python () {
    # unpack_gem need ruby to be installed in sysroot to succeed
    if bb.data.inherits_class('native', d):
        d.appendVarFlag('do_gem_unpack', 'depends', ' ruby-native:do_populate_sysroot')
    else:
        d.appendVarFlag('do_gem_unpack', 'depends', ' ruby-cross-%s:do_populate_sysroot' % d.getVar("TARGET_ARCH", True))
}

python do_arch_patch_config() {
    import re
    if bb.data.inherits_class('native', d):
        return
    _map = {
        "AR": d.expand("${AR}"),
        "AS": d.expand("${AS}"),
        "CC": d.expand("${CC}"),
        "CFLAGS": d.expand("${CFLAGS}"),
        "CPP": d.expand("${CPP}"),
        "CPPFLAGS": d.expand("${CPPFLAGS}"),
        "CXX": d.expand("${CXX}"),
        "CXXFLAGS": d.expand("${CFLAGS}"),
        "LDFLAGS": d.expand("${LDFLAGS}"),
        "NM": d.expand("${NM}"),
        "OBJDUMP": d.expand("${OBJDUMP}"),
        "RANLIB": d.expand("${RANLIB}"),
        "STRIP": d.expand("${STRIP}"),
        "cppflags": d.expand("${CPPFLAGS}"),
        "SOEXT": d.expand("so.${PV}"),
        "DLEXT": d.expand("so.${PV}"),
    }

    with open(d.expand("${RUBYLIB}/rbconfig.rb")) as i:
        cnt = i.read()

    for m in re.finditer(r'^(\s+|\t+)CONFIG\[\"(?P<var>.*)\"\]\s+=\s+\"(?P<value>.*)\"$', cnt, re.MULTILINE):
        if m.group("var") in _map:
            _rpl = '  CONFIG["{}"] = "{}"'.format(m.group("var"), _map[m.group("var")])
            bb.note("Replace {} by {}".format(m.group(0), _rpl))
            cnt = cnt.replace(m.group(0), _rpl)

    with open(d.expand("${RUBYLIB}/rbconfig.rb"), "w") as o:
        o.write(cnt)
}

python do_rubygems_fix_libs() {
    # as ruby dynloader expects the shared .so files
    # without extension we will create symlinks to the
    # properly versioned file
    for root, dirs, files in os.walk(d.expand("${GEM_HOME}")):
        for f in files:
            if f.endswith(d.expand("so.${PV}")):
                _filename = os.path.basename(f)
                while "." in _filename:
                    try:
                        os.symlink(os.path.basename(f), os.path.join(root, _filename))
                    except:
                        pass
                    _filename, _ = os.path.splitext(_filename)
}

python do_rubygems_gen_test() {
    import glob
    import json

    def sanitize_name(pn):
        return pn.replace("-", "_")

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

python() {
    if d.getVar("RUBYGEMS_AUTOGEN_TESTS") == "1":
        d.setVarFlag("do_rubygems_gen_test", "nostamp", "1")
    else:
        d.setVarFlag("do_rubygems_gen_test", "noexec", "1")
}

rubygems_do_compile() {
    export GEM_PATH=${GEM_PATH}
    export GEM_HOME=${GEM_HOME}
    export GEM_SPEC=${GEM_SPEC_CACHE}
    export RUBYLIB=${RUBYLIB}

    export LANG="en_US.UTF-8"
    export LANGUAGE="en_US.UTF-8"
    export LC_ALL="en_US.UTF-8"

    # Older versions of gem build don't understand -o flag, so try it once more without
    # it, if the command is failing
    gem build -V ${GEM_SPEC_FILE} -o ${GEM_BUILT_FILE} || gem build -V ${GEM_SPEC_FILE}
}

rubygems_do_install() {
    export GEM_PATH=${GEM_PATH}
    export GEM_SPEC=${GEM_SPEC_CACHE}
    export RUBYLIB=${RUBYLIB}

    gem uninstall ${GEM_NAME} --version ${GEM_VERSION} -x -q -V || true

    gem install --local --bindir ${D}${bindir} ${GEM_BUILT_FILE} --install-dir=${GEM_HOME} -E --no-user-install --ignore-dependencies --force --conservative -V -- ${GEM_INSTALL_FLAGS}

    # remove all object files
    find ${GEM_HOME} -name "*.o" -type f -exec rm -f {} \;
}

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-chef-telemetry \
    rubygems-faraday \
    rubygems-faraday-middleware \
    rubygems-hashie \
    rubygems-license-acceptance \
    rubygems-method-source \
    rubygems-mixlib-log \
    rubygems-multipart-post \
    rubygems-parallel \
    rubygems-parslet \
    rubygems-pry \
    rubygems-rspec \
    rubygems-rspec-its \
    rubygems-rubyzip \
    rubygems-semverse \
    rubygems-sslshake \
    rubygems-thor \
    rubygems-tomlrb \
    rubygems-train-core \
    rubygems-tty-prompt \
    rubygems-tty-table \
"

BBCLASSEXTEND = "native"
