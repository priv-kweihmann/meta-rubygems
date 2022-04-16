# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1489f4b5bc18d549a2b22e2f2a04e0e3"
SRC_URI[sha256sum] = "10e593141a9f0c1d649c7eedc6ca656e43579c455037c4dcb792f865769327f0"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
