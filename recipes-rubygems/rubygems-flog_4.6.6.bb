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

SRC_URI[md5sum] = "fa1c44e88c5d7d62a4655abf0cba0172"
SRC_URI[sha256sum] = "edf919b06d7aa5a7de3790e2b24e4a983f843a43e3463a980334685bcf24a99f"

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
