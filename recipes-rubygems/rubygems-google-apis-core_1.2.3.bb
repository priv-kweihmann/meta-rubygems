# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-core"
DESCRIPTION = "Common utility and base classes for legacy Google REST clients"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-faraday-follow-redirects-native \
    rubygems-faraday-native \
    rubygems-googleauth-native \
    rubygems-mini-mime-native \
    rubygems-multi-json-native \
    rubygems-representable-native \
    rubygems-retriable-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a72e6b9a68e414ebfcbd7c220ba92d42"
SRC_URI[sha256sum] = "2ce34c17c144e24d966ecb0efa5d46aaba3e3e3721ba1faa1ed80db2389e7b08"

GEM_NAME = "google-apis-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-faraday \
    rubygems-faraday-follow-redirects \
    rubygems-googleauth \
    rubygems-mini-mime \
    rubygems-multi-json \
    rubygems-representable \
    rubygems-retriable \
"

BBCLASSEXTEND = "native"
