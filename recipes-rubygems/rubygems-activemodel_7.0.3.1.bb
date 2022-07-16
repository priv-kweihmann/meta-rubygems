# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=1c7e49426691ab447bf74800e671a0eb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b6adf89cd66f45ec382d6165f9a70a7d"
SRC_URI[sha256sum] = "26e0ad3a8fe2283583204843891bce946b61b8e1f411f4a1cbc726a282962f69"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
