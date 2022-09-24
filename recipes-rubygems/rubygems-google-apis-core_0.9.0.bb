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
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0137048439f864de7a0e63a6523ee473"
SRC_URI[sha256sum] = "8ce6e7f887e6e37323e2d6954335a366fd1dc3b25b12f90e149feb5ed82735f1"

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
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
