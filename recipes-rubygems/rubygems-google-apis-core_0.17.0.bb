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
    rubygems-mutex-m-native \
    rubygems-representable-native \
    rubygems-retriable-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c0687df3af095663f7bb1ca43cf4fa95"
SRC_URI[sha256sum] = "3d4408b26b3f4b517b869be3c5aba40db0e172b4481c20ff882ef47579dd08f8"

GEM_NAME = "google-apis-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-googleauth \
    rubygems-httpclient \
    rubygems-mini-mime \
    rubygems-mutex-m \
    rubygems-representable \
    rubygems-retriable \
"

BBCLASSEXTEND = "native"
