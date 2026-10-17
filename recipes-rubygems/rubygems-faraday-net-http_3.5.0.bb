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

SRC_URI[md5sum] = "22a15971ec039c3b3dcf763ed417ec31"
SRC_URI[sha256sum] = "2e7094c34e38754ee048cc3df47376f8657005d9375f8473bce1c3b526a22e36"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-http \
"

BBCLASSEXTEND = "native"
