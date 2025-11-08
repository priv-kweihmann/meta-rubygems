# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-net-http-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e26dd63d13fa7e96d8138f4f258546e0"
SRC_URI[sha256sum] = "f147758260d3526939bf57ecf911682f94926a3666502e24c69992765875906c"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-http \
"

BBCLASSEXTEND = "native"
