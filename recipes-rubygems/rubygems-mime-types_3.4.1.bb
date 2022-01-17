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

SRC_URI[md5sum] = "990decc351d71f9e47c3d211fc0d4994"
SRC_URI[sha256sum] = "6bcf8b0e656b6ae9977bdc1351ef211d0383252d2f759a59ef4bcf254542fc46"

GEM_NAME = "mime-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mime-types-data \
"

BBCLASSEXTEND = "native"
