# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-cookie"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265"
HOMEPAGE = "https://github.com/sparklemotion/http-cookie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ac66e3bfd4a0a136794899462149afa8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-domain-name-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d8e19c9cea0399f3c43e5a70368d7178"
SRC_URI[sha256sum] = "8dd8011dedcae5f91af2671b7ba878c4a9e89f0f6384790c1f4cdd176f5e3ada"

GEM_NAME = "http-cookie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-domain-name \
"

BBCLASSEXTEND = "native"
