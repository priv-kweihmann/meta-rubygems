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

SRC_URI[md5sum] = "dae28ee18572c50428bb3682a5c11f53"
SRC_URI[sha256sum] = "b41720b13f56dae77114d9de54baef2d76d0b06ab40d695b2a98e254b56ade0b"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
