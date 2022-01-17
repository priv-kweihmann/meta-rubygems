# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-generator"
DESCRIPTION = "Code generator for legacy Google REST clients"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
    rubygems-gems-native \
    rubygems-google-apis-core-native \
    rubygems-google-apis-discovery-v1-native \
    rubygems-thor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0d1b852750e75c8f24c0765a60a6a834"
SRC_URI[sha256sum] = "e51e6c4696ac260450f5ffee88ada58996b765af53ebcbb94d9a35dbb4b694c2"

GEM_NAME = "google-apis-generator"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
    rubygems-gems \
    rubygems-google-apis-core \
    rubygems-google-apis-discovery-v1 \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
