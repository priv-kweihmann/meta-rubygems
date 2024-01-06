# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types"
DESCRIPTION = "The mime-types library provides a library and registry for information aboutMIME content type definitions"
HOMEPAGE = "https://github.com/mime-types/ruby-mime-types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=7870e5ae011593e135dec1b86fd81e8e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-mime-types-data-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4bcb4f128f16bf701752e3dabc9f1c44"
SRC_URI[sha256sum] = "c1299f10fa34c75a6f168e99e9dadbd11bc507d9d62dc5cf98c4e65f2af8c4e4"

GEM_NAME = "mime-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mime-types-data \
"

BBCLASSEXTEND = "native"
