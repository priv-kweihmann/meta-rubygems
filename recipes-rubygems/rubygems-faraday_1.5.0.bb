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
    rubygems-faraday-httpclient-native \
    rubygems-faraday-net-http-native \
    rubygems-faraday-net-http-persistent-native \
    rubygems-faraday-patron-native \
    rubygems-multipart-post-native \
    rubygems-ruby2-keywords-native \
"

SRC_URI[md5sum] = "f76b42b360cda06c66b20d5904534d17"
SRC_URI[sha256sum] = "5001f0d51f989c9a37298e888e518bbdb0dc3ffc7c0931255da9d25b488c8b3f"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-faraday-em-http \
    rubygems-faraday-em-synchrony \
    rubygems-faraday-excon \
    rubygems-faraday-httpclient \
    rubygems-faraday-net-http \
    rubygems-faraday-net-http-persistent \
    rubygems-faraday-patron \
    rubygems-multipart-post \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
