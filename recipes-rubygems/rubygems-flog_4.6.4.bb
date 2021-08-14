# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: flog"
DESCRIPTION = "Flog reports the most tortured code in an easy to read painreport"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=42;endline=65;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_RDEPENDS:append = " rubygems-gauntlet"

DEPENDS:class-native += "\
    rubygems-path-expander-native \
    rubygems-ruby-parser-native \
    rubygems-sexp-processor-native \
"

SRC_URI[md5sum] = "0c4d4707090126e0faa43063c089f24c"
SRC_URI[sha256sum] = "b5aa03696c075a7d672cd5e24cee36e4b76c23e200a2add0618b834270d1c763"

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
