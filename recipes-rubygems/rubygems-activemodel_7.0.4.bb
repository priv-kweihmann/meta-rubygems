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

SRC_URI[md5sum] = "2958d2f1a408a98040669a69d872f5e3"
SRC_URI[sha256sum] = "73e455768c206586cecb5aa5e157d6c299eebd1e704ae8fde1a0bbf7e6ee4a73"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
