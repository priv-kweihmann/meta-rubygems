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

SRC_URI[md5sum] = "155ab4b7325494339776885dc546fb61"
SRC_URI[sha256sum] = "095757fae7872b94eac839c08a1a4b8d84fd91d6886cfbe75caa2143de64ab3b"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-http \
"

BBCLASSEXTEND = "native"
