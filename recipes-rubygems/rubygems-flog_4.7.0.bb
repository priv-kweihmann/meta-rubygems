# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: flog"
DESCRIPTION = "Flog reports the most tortured code in an easy to read painreport"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=42;endline=65;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-path-expander-native \
    rubygems-ruby-parser-native \
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "aef19441d585309eb18b5c3d97ebdccd"
SRC_URI[sha256sum] = "b2a31e568958e4c0ad39f0cbdf29e1f8aa4908b0d5f592701ae1eece1926d546"

GEM_NAME = "flog"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # some scripts point to wrong ruby intepreter, propably hardcoded
    find ${D} -type f -exec sed -i "s#/usr/local/bin/ruby#${bindir}/ruby#g" {} \;
}

RDEPENDS:${PN}:class-target += "\
    rubygems-path-expander \
    rubygems-ruby-parser \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
