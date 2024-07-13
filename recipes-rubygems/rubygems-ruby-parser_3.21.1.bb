# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby_parser"
DESCRIPTION = "ruby_parser (RP) is a ruby parser written in pure ruby (utilizingracc--which does by default use a C extension)"
HOMEPAGE = "https://github.com/seattlerb/ruby_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=90;endline=113;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-racc-native \
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "64cb059ca2b1e69b66b6a31b944f2092"
SRC_URI[sha256sum] = "9d931abe5aec287d65280f811d3cf672564956ef1bd49f528ca48479984d6fec"

GEM_NAME = "ruby_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-racc \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
