# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-compute_v1"
DESCRIPTION = "This is the simple REST client for Compute Engine API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2842fdcdb5c1a77e88a8b259c45ac05f"
SRC_URI[sha256sum] = "b82dc014830971cc628b55e416bbb3b8a7a34bc022c0c9b4119662adb5e3215f"

GEM_NAME = "google-apis-compute_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
