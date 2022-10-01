# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b42f58690672ed318fb833a307321864"
SRC_URI[sha256sum] = "2e5accfe126884e5ebd8540b3a17a878a3a050d0dfdf0ece6b231846fc485a15"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
