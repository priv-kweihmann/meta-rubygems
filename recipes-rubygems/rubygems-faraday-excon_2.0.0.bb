# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-excon"
DESCRIPTION = "Faraday adapter for Excon"
HOMEPAGE = "https://github.com/lostisland/faraday-excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-excon-native \
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7bdf627214f73ab4286e037c024d5f06"
SRC_URI[sha256sum] = "b2e2d3d86356683e537af02e41cb733ca0273315899b6f9b40fa63ebeb664604"

GEM_NAME = "faraday-excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
