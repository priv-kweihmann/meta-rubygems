# Based on https://github.com/voxtok/meta-oad-ruby/blob/dizzy/classes/rubygems.bbclass
## SPDX-License-Identifier: MIT, BSD-2-Clause
## Copyright (c) 2015, Michaël Burtin
## Copyright (c) 2020, Konrad Weihmann

GEMLIB_VERSION = "3.1.0"

GEM_SRC ?= "http://rubygems.org/gems"

GEM_NAME ?= ""
GEM_VERSION ?= "${PV}"

SRC_URI = "${GEM_SRC}/${GEM_FILENAME}"
GEMPREFIX = "gem-"

S = "${WORKDIR}/${GEM_NAME}-${GEM_VERSION}"

GEM_FILENAME = "${GEM_NAME}-${GEM_VERSION}.gem"
GEM_FILE ?= "${WORKDIR}/${GEM_FILENAME}"
GEM_BUILT_FILE = "${S}/${GEM_FILENAME}"

GEM_SPEC_FILENAME = "${GEM_FILENAME}spec"
GEM_SPEC_FILE ?= "${S}/${GEM_SPEC_FILENAME}"
GEM_SPEC_CACHE ?= "${T}/.gems"

GEM_DIR = "${libdir}/ruby/gems/${GEMLIB_VERSION}"
RUBY_SITEDIR = "${libdir}/ruby/site_ruby/"
GEM_HOME = "${D}${GEM_DIR}"
GEM_PATH:class-target = "${RECIPE_SYSROOT}${GEM_DIR}:${RECIPE_SYSROOT}${GEM_DIR}:${GEM_HOME}"
GEM_PATH:class-native = "${RECIPE_SYSROOT_NATIVE}${GEM_DIR}:${GEM_HOME}"

# Disable the very strict versioning with ~>
GEM_DISABLE_STRICT_VER ?= "1"

GEM_INSTALL_FLAGS ?= ""

# Use the following to define extra depend/rdepends
# which cannot be seen by the package updater
EXTRA_RDEPENDS ?= ""
EXTRA_DEPENDS ?= ""

RUBYLIB_EXTRA_PATHS ?= ""

def extra_paths(d):
    res = (d.getVar('RUBYLIB_EXTRA_PATHS') or '').split(' ')
    if res:
        return ':' + ':'.join(res)
    return ''

RUBYLIB:class-target = "${STAGING_LIBDIR_NATIVE}/ruby/${GEMLIB_VERSION}/${@get_build_platform_folder(d)}${@extra_paths(d)}"
RUBYPLATFORM ?= "ruby"
RUBYPLATFORM:class-target ?= "${@get_target_platform_folder(d)}"
CFLAGS:append = " -DHAVE_GCC_CAS"

def get_gem_name_from_bpn(d):
    bpn = (d.getVar('BPN', True) or "")
    gemPrefix = (d.getVar('GEMPREFIX', True) or "")
    if bpn.startswith(gemPrefix):
        gemName = bpn[len(gemPrefix):]
    else:
        gemName = bpn
    return gemName

def get_build_platform_folder(d):
    build_arch = d.getVar("BUILD_ARCH")
    build_os = d.getVar("BUILD_OS")
    if build_os.endswith("linux"):
        build_os = build_os.replace('linux', 'linux-gnu')
    return build_arch + "-" + build_os

def get_target_platform_folder(d):
    target_arch = d.getVar("HOST_ARCH")
    target_os = d.getVar("HOST_OS")
    if target_os.endswith("linux"):
        target_os = target_os.replace('linux', 'linux-gnu')
    return target_arch + "-" + target_os

do_gem_unpack() {
    export RUBYLIB=${RUBYLIB}

    cd ${WORKDIR}
    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem unpack -V ${GEM_FILE}
}

DEPENDS:append = " ruby-native ${EXTRA_DEPENDS}"
DEPENDS:append:class-target = " ruby ruby-native ${EXTRA_DEPENDS}"

python () {
    d.appendVarFlag('do_gem_unpack', 'depends', ' ruby-native:do_populate_sysroot')
}

do_gem_unpack[vardepsexclude] += "prefix_native"
addtask do_gem_unpack after do_unpack before do_patch

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

do_generate_spec[vardepsexclude] += "prefix_native"
addtask do_generate_spec after do_gem_unpack before do_patch

python do_arch_patch_config() {
    import re
    if bb.data.inherits_class('native', d):
        return
    target_cpu, target_vendor, target_os = get_target_platform_folder(d).split('-')

    _map = {
        "AR": d.expand("${AR}"),
        "arch": d.expand("${RUBYPLATFORM}"),
        "archincludedir": "$(includedir)",
        "archlibdir": "$(libdir)",
        "AS": d.expand("${AS}"),
        "CC": d.expand("${CC}"),
        "CFLAGS": d.expand("${CFLAGS}"),
        "CPP": d.expand("${CPP}"),
        "CPPFLAGS": d.expand("${CPPFLAGS}"),
        "cppflags": d.expand("${CPPFLAGS}"),
        "CROSS_COMPILING": "yes",
        "CXX": d.expand("${CXX}"),
        "CXXFLAGS": d.expand("${CFLAGS}"),
        "DLEXT": d.expand("so.${PV}"),
        "host_alias": "-".join([target_cpu, target_vendor]),
        "host_cpu": target_cpu,
        "host_os": target_os,
        "host": get_target_platform_folder(d),
        "includedir": d.expand("${STAGING_INCDIR}"),
        "LD": d.expand("${LD}"),
        "LDFLAGS": d.expand("${LDFLAGS}"),
        "libdir": d.getVar("STAGING_LIBDIR"),
        "libexecdir": "$(exec_prefix)/libexec",
        "NM": d.expand("${NM}"),
        "OBJDUMP": d.expand("${OBJDUMP}"),
        "RANLIB": d.expand("${RANLIB}"),
        "SOEXT": d.expand("so.${PV}"),
        "STRIP": d.expand("${STRIP}"),
        "target_alias": "-".join([target_cpu, target_vendor]),
        "target_cpu": target_cpu,
        "target_os": target_os,
        "target": get_target_platform_folder(d),
        "TEST_RUNNABLE": "no",
        #"DLDFLAGS": d.expand("${LDFLAGS}"),
    }

    cnt = ""
    for item in d.expand("${RUBYLIB}").split(':'):
        item = os.path.join(item, 'rbconfig.rb')
        if not os.path.isfile(item) or not os.path.exists(item):
            continue
        with open(item) as i:
            cnt = i.read()

        for m in re.finditer(r'^(\s+|\t+)CONFIG\[\"(?P<var>.*)\"\]\s+=\s+\"(?P<value>.*)\"$', cnt, re.MULTILINE):
            if m.group("var") in _map:
                _rpl = '  CONFIG["{}"] = "{}"'.format(m.group("var"), _map[m.group("var")])
                bb.note("Replace {} by {}".format(m.group(0), _rpl))
                cnt = cnt.replace(m.group(0), _rpl)

        with open(item, "w") as o:
            o.write(cnt)
}

do_arch_patch_config[doc] = "patches the correct compiler settings into the cross template"
addtask do_arch_patch_config after do_generate_spec do_gem_unpack before do_compile

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

RUBY_INSTALL_EXTRA_FLAGS ?= ""

rubygems_do_install() {
    export GEM_PATH=${GEM_PATH}
    export GEM_SPEC=${GEM_SPEC_CACHE}
    export RUBYLIB=${RUBYLIB}

    gem uninstall ${GEM_NAME} --version ${GEM_VERSION} -x -q -V || true

    gem install --local --bindir ${D}${bindir} ${GEM_BUILT_FILE} --install-dir=${GEM_HOME} -E --backtrace --norc --no-user-install --ignore-dependencies --force --conservative -V ${RUBY_INSTALL_EXTRA_FLAGS} -- ${GEM_INSTALL_FLAGS}

    # remove all object files
    find ${GEM_HOME} -name "*.o" -type f -exec rm -f {} \;
}

EXPORT_FUNCTIONS do_compile do_install
do_install[postfuncs] += "do_rubygems_fix_libs"

PACKAGES =+ "${PN}-examples ${PN}-tests"

FILES:${PN}-dbg += "\
    /usr/src/debug/* \
    ${libdir}/ruby/**/.debug \
"
FILES:${PN}-staticdev += "\
    ${libdir}/ruby/gems/gems/**/.libs/*.a \
"
FILES:${PN}-dev += "\
    ${GEM_DIR}/extensions/*/*/*/gem_make.out \
    ${GEM_DIR}/extensions/*/*/*/mkmf.log \
    ${GEM_DIR}/build_info \
    ${GEM_DIR}/cache \
    ${GEM_DIR}/gems/*/debian.template \
    ${GEM_DIR}/gems/*/ext/ \
    ${GEM_DIR}/gems/*/spec/ \
    ${GEM_DIR}/gems/*/lib/generators \
    ${GEM_DIR}/gems/*/patches \
"
FILES:${PN}-tests = "\
    ${GEM_DIR}/gems/*/tests \
    ${GEM_DIR}/gems/*/test \
"
FILES:${PN}-examples = "\
    ${GEM_DIR}/gems/*/example \
    ${GEM_DIR}/gems/*/samples \
"
FILES:${PN}-doc += "\
    ${GEM_DIR}/gems/*/doc \
    ${GEM_DIR}/doc \
"
FILES:${PN} += "\
    ${GEM_DIR}/extensions \
    ${GEM_DIR}/gems \
    ${GEM_DIR}/specifications \
    ${RUBY_SITEDIR} \
    ${libdir}/ruby/gems/${GEMLIB_VERSION}/plugins \
"

RDEPENDS:${PN}:append:class-target = " ruby ${EXTRA_RDEPENDS}"
RDEPENDS:${PN}-tests:append:class-target = " ruby"

UPSTREAM_CHECK_URI ?= "https://rubygems.org/gems/${GEM_NAME}/versions"
UPSTREAM_CHECK_REGEX ?= "/gems/${GEM_NAME}/versions/(?P<pver>(\d+\.*)*\d+)$"

# the ruby dynamic linker just uses plain .so files
# so we have to supply symlinks as part of the base package
INSANE_SKIP:${PN} += "dev-so"
# we don't care what is actually needed for the dev-package
INSANE_SKIP:${PN}-dev += "file-rdeps"
