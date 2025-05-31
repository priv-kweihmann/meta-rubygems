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

SRC_URI[md5sum] = "b919dff9642e42d8e4ed0ca8f14fe588"
SRC_URI[sha256sum] = "26fdde355b9650261cf971df05593fc04f0b2eab18553678ba818bec1fe9a06a"

GEM_NAME = "google-apis-monitoring_v3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
