# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-cookie"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265"
HOMEPAGE = "https://github.com/sparklemotion/http-cookie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f217a5829e26ed04a05e5ba14eaf2128"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-domain-name-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9f7c37bcfe0dced6084d64e68dc0eea5"
SRC_URI[sha256sum] = "7713d3196f21ff5ab0944011d7d4e619b62ec082374a52de2193ccfe78924044"

GEM_NAME = "http-cookie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-domain-name \
"

BBCLASSEXTEND = "native"
