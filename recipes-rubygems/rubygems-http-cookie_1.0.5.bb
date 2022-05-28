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

SRC_URI[md5sum] = "59b15c13687a44deadcfa1586355bb75"
SRC_URI[sha256sum] = "73756d46c7dbdc7023deecdb8a171348ea95a1b99810b31cfe8b4fb4e9a6318f"

GEM_NAME = "http-cookie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-domain-name \
"

BBCLASSEXTEND = "native"
