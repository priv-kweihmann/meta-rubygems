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

SRC_URI[md5sum] = "653e6f9a17659d95334d4beba8f465f1"
SRC_URI[sha256sum] = "9f9699bd88f3b354c02b44530c2c02f95033386809559dfec1ab4ea706d2950e"

GEM_NAME = "google-apis-monitoring_v3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
