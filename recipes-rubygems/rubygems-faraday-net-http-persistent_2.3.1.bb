# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http_persistent"
DESCRIPTION = "Faraday adapter for NetHttpPersistent"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http_persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
    rubygems-net-http-persistent-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5a8a3dd7d24517d102f97464f1809771"
SRC_URI[sha256sum] = "23ffba37d6a27807a10f033d01918ec958aa73fa6ff0fccfbcd5ce2d2e68fca3"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
