# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: flog"
DESCRIPTION = "Flog reports the most tortured code in an easy to read painreport"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://README.rdoc;beginline=42;endline=65;md5=5db85eba7780ac1765a03fe0e5ec1657 \
"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-path-expander-native \
    rubygems-prism-native \
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "89402b5dbae8f7bfb819f24cfce77ee6"
SRC_URI[sha256sum] = "8be0548374cfd22a362a1f7af0cfe4be242b925ae62dfe557c0c52b985f723e2"

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
    rubygems-prism \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
