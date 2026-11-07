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

SRC_URI[md5sum] = "68b5aa299bfcfdd90b43960be7c9cf68"
SRC_URI[sha256sum] = "2d0b9f1aa00e52c94c6e151efecb6ae0086be33bed2dfed8ca835ca1a84cc8aa"

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
