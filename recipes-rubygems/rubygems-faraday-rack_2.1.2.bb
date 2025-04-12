# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-rack"
DESCRIPTION = "Faraday adapter for Rack"
HOMEPAGE = "https://github.com/lostisland/faraday-rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ae337ec611f734fed243e5b9ce13a768"
SRC_URI[sha256sum] = "b71e7da46249793861d4ed49841d13e25d1c4714788bad9c8ac679d6d26deed5"

GEM_NAME = "faraday-rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
