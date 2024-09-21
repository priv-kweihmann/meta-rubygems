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

SRC_URI[md5sum] = "24e857e5ad7f0a281605a967d97e2962"
SRC_URI[sha256sum] = "aebc84f5166cce77a5a9e05e14873326ee0c25e5611e22b8df99c1fbfd23f60e"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
