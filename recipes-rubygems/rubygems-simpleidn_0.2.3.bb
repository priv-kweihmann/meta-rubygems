# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simpleidn"
DESCRIPTION = "This gem allows easy conversion from punycode ACE strings to unicode UTF-8 strings and vice-versa."
HOMEPAGE = "https://github.com/mmriis/simpleidn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=125a8c5aa0f0043945e84c8bdbf84257"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "270e236fc9772a0d7dc96e5a82a9372d"
SRC_URI[sha256sum] = "08ce96f03fa1605286be22651ba0fc9c0b2d6272c9b27a260bc88be05b0d2c29"

GEM_NAME = "simpleidn"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
