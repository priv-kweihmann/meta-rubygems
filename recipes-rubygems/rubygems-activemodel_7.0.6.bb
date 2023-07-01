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

SRC_URI[md5sum] = "85837babaf8921430c474af49b9f6988"
SRC_URI[sha256sum] = "5231fe572d7599237b6b2a4987ebf439d028754a529227630777dd3d1ad8511c"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
