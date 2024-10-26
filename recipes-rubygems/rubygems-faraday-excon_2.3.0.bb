# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-excon"
DESCRIPTION = "Faraday adapter for Excon"
HOMEPAGE = "https://github.com/excon/faraday-excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-excon-native \
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3efc2b6e0609d7f7482a55ba726a9fb6"
SRC_URI[sha256sum] = "c5fc7175ab284b164496559e35f550587ec5b028b3cdbb40b7ebe83aa7e5b575"

GEM_NAME = "faraday-excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
