# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-cookie"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265"
HOMEPAGE = "https://github.com/sparklemotion/http-cookie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f217a5829e26ed04a05e5ba14eaf2128"

DEPENDS_class-native += "\
    rubygems-domain-name-native \
"

SRC_URI[md5sum] = "72925abeaa57cf214e93fee5ec101bbd"
SRC_URI[sha256sum] = "89a64e1b9e3ed823b559b2030e0b62ad850d0d11325a0589145ebf93d80267a4"

GEM_NAME = "http-cookie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-domain-name \
"

BBCLASSEXTEND = "native"
