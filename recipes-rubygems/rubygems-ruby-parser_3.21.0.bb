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

SRC_URI[md5sum] = "29928f853c5dd5714a67210c00ab93f9"
SRC_URI[sha256sum] = "3842893d2f4602dcd93c0a79d77f9ce8e1ce197d41ac533d8e25c684f8f1c56b"

GEM_NAME = "ruby_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-racc \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
