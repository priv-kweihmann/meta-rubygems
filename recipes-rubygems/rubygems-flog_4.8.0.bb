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

SRC_URI[md5sum] = "b2f19aab6d227c685cfed1deabc7a753"
SRC_URI[sha256sum] = "e04d0fc334175d00d765ddfb7b631ae3df39ed7f80f28aad8f72b996927fa2e4"

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
