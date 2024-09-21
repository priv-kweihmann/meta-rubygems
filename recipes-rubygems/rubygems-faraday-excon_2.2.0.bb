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

SRC_URI[md5sum] = "a0dbdba8ec2a5db859d0bd21690b6ad7"
SRC_URI[sha256sum] = "46956f67aa7a402472a23749b158b9d5d3b54bfc73789167126c84aacc786c0e"

GEM_NAME = "faraday-excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
