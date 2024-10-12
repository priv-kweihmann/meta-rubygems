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

SRC_URI[md5sum] = "b8003472ed288c44021dcfed574353b2"
SRC_URI[sha256sum] = "33d4948cabe9f8148222c4ca19634c71e1f25595cccf9da2e02ace8d754f1bb1"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
