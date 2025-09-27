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

SRC_URI[md5sum] = "40f3dcc9e6ae508f7136585a92d481ba"
SRC_URI[sha256sum] = "38a5e60d1527eebc396831b8c4b9455440509881219273a6c99943d29eadbb19"

GEM_NAME = "http-cookie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-domain-name \
"

BBCLASSEXTEND = "native"
