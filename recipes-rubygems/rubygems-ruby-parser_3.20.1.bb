# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby_parser"
DESCRIPTION = "ruby_parser (RP) is a ruby parser written in pure ruby (utilizingracc--which does by default use a C extension)"
HOMEPAGE = "https://github.com/seattlerb/ruby_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=90;endline=113;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "782b3f79812a1be74b3b82f5990ef537"
SRC_URI[sha256sum] = "78b0f6f47a791e9bb15a35d14e3a4ca55b5a64a362ad673887a86ff9b90de9c7"

GEM_NAME = "ruby_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
