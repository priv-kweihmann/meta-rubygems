# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS_class-native += "rubygems-faraday-net-http-native \
                         rubygems-multipart-post-native \
                         rubygems-ruby2-keywords-native"
RDEPENDS_${PN}_class-target += "rubygems-faraday-net-http \
                                rubygems-multipart-post \
                                rubygems-ruby2-keywords"

SRC_URI[md5sum] = "e16e9d81a3aadd2c2d715261226f6579"
SRC_URI[sha256sum] = "7f06817ba823ddeabf4dd85ca5e0f63e234527f564a03f09f6c7127951d3bac2"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
