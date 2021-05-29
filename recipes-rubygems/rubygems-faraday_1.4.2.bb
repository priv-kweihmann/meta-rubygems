# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS_class-native += "\
    rubygems-faraday-em-http-native \
    rubygems-faraday-em-synchrony-native \
    rubygems-faraday-excon-native \
    rubygems-faraday-net-http-native \
    rubygems-faraday-net-http-persistent-native \
    rubygems-multipart-post-native \
    rubygems-ruby2-keywords-native \
"

SRC_URI[md5sum] = "77cdd35f32618ae19e7fc2a13dfba443"
SRC_URI[sha256sum] = "fbac4fc71c941a7030bdf65edc6e84de4e080e3164b48ac6bba390fdc099b01e"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-faraday-em-http \
    rubygems-faraday-em-synchrony \
    rubygems-faraday-excon \
    rubygems-faraday-net-http \
    rubygems-faraday-net-http-persistent \
    rubygems-multipart-post \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
