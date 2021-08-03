# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-cookie_jar"
DESCRIPTION = "Cookie jar middleware for Faraday"
HOMEPAGE = "https://github.com/miyagawa/faraday-cookie_jar"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b90bc684ef2518794f21ae39c3f065c6"

DEPENDS:class-native += "\
    rubygems-faraday-native \
    rubygems-http-cookie-native \
"

SRC_URI[md5sum] = "e711bb68116ad57621fb2f0d31cc7f0e"
SRC_URI[sha256sum] = "f3cbbe6f2de3d4028f00a67ae4196b99348a6dc3c065fdae6d3c7123fa8b1402"

GEM_NAME = "faraday-cookie_jar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-http-cookie \
"

BBCLASSEXTEND = "native"
