# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-rack"
DESCRIPTION = "Faraday adapter for Rack"
HOMEPAGE = "https://github.com/lostisland/faraday-rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "79d56faaa6d117bf57b8b12630afac8f"
SRC_URI[sha256sum] = "9869993a8f1010ade286bda697dea43a8f29f0ab760877d73ec7de5d1d18faed"

GEM_NAME = "faraday-rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
