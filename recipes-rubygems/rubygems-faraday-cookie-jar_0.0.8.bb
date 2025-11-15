# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-cookie_jar"
DESCRIPTION = "Cookie jar middleware for Faraday"
HOMEPAGE = "https://github.com/miyagawa/faraday-cookie_jar"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b90bc684ef2518794f21ae39c3f065c6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
    rubygems-http-cookie-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5f81ed48549c7630f14d36a75f71d4dc"
SRC_URI[sha256sum] = "0140605823f8cc63c7028fccee486aaed8e54835c360cffc1f7c8c07c4299dbb"

GEM_NAME = "faraday-cookie_jar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-http-cookie \
"

BBCLASSEXTEND = "native"
