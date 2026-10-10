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

SRC_URI[md5sum] = "b6de878b56d202dca9d34ffd4d770f91"
SRC_URI[sha256sum] = "94543a5a1d0a0de98c165ac6ae68d2c1f131ad3734123994136b74c6484664f0"

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
