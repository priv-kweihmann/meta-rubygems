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
    rubygems-googleauth-native \
    rubygems-httpclient-native \
    rubygems-mini-mime-native \
    rubygems-representable-native \
    rubygems-retriable-native \
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a10648d66cc837d74fdca16ef4162bfc"
SRC_URI[sha256sum] = "4cd4f0033819e6685575686220437a98eb36e12524b620f6d5a11c4aff30a83b"

GEM_NAME = "google-apis-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-googleauth \
    rubygems-httpclient \
    rubygems-mini-mime \
    rubygems-representable \
    rubygems-retriable \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
