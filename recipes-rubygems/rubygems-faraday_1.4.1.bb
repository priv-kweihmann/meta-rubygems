# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS_class-native += "\
    rubygems-faraday-excon-native \
    rubygems-faraday-net-http-native \
    rubygems-faraday-net-http-persistent-native \
    rubygems-multipart-post-native \
    rubygems-ruby2-keywords-native \
"

SRC_URI[md5sum] = "cba4ba88c95fc453d8d9e04dea41a0e9"
SRC_URI[sha256sum] = "71c3864e7c2325821c6023bc498d748f6502803c073759fa5450397a4035c460"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-faraday-excon \
    rubygems-faraday-net-http \
    rubygems-faraday-net-http-persistent \
    rubygems-multipart-post \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
