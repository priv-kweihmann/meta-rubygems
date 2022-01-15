# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b49b0c0d18defa0d8d61e6967c8f6262"
SRC_URI[sha256sum] = "f867b028552c3cf018b9293b58b993dc238ba62683568b3e194c673afe62d700"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
