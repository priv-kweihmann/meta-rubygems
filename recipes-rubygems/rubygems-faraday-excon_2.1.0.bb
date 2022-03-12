# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-excon"
DESCRIPTION = "Faraday adapter for Excon"
HOMEPAGE = "https://github.com/lostisland/faraday-excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-excon-native \
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "877a1b9f62a6fd5e6efda124fa842c59"
SRC_URI[sha256sum] = "d487bad1c13342457fbcf79d0abc70f8d6d07280c0276bba716122e4a79eebfa"

GEM_NAME = "faraday-excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
