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

SRC_URI[md5sum] = "92db0050c074289e458ee50e7f449886"
SRC_URI[sha256sum] = "8d2289a695dc81ffddcdd5a56e80c9a109806bc0d0b1239a1c852b0c71251c49"

GEM_NAME = "ruby_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
