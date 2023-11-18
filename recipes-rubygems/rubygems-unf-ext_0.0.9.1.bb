# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unf_ext"
DESCRIPTION = "Unicode Normalization Form support library for CRuby"
HOMEPAGE = "https://github.com/knu/ruby-unf_ext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eeabce56bdb2bf10564523e7b9e42412"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6fa2cf303e3953567c3d0176557af6db"
SRC_URI[sha256sum] = "926114a858934126c6bbfd3254347dadb5dae354711869368c0f75e3765fc6e9"

GEM_NAME = "unf_ext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
