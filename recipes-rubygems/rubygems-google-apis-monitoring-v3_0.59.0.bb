# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-monitoring_v3"
DESCRIPTION = "This is the simple REST client for Cloud Monitoring API V3"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1ef12b37267950dfa8faae5d3c00fd13"
SRC_URI[sha256sum] = "c55b3b4a473148f0ac89d1d2db9ff5fd1886914287f4a29566f6f5c60ca35743"

GEM_NAME = "google-apis-monitoring_v3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
