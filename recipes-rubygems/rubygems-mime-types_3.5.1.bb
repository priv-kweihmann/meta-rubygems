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

SRC_URI[md5sum] = "4754d798c156458440a645f7a31a3ec2"
SRC_URI[sha256sum] = "85d772fb6cf21f999ac8085998192fb9dd5d16e86ec4c69c5e79ac3003420d61"

GEM_NAME = "mime-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mime-types-data \
"

BBCLASSEXTEND = "native"
