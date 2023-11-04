# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/main/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-inspec-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ed3eb4eb16cf84c256fc72427ece1c50"
SRC_URI[sha256sum] = "519deccb4661d614ecf4dd580112af0e26cc4c97fc77797b1cf53f493aa29bc0"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
