# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS:class-native += "\
    rubygems-faraday-em-http-native \
    rubygems-faraday-em-synchrony-native \
    rubygems-faraday-excon-native \
    rubygems-faraday-httpclient-native \
    rubygems-faraday-net-http-native \
    rubygems-faraday-net-http-persistent-native \
    rubygems-faraday-patron-native \
    rubygems-faraday-rack-native \
    rubygems-multipart-post-native \
    rubygems-ruby2-keywords-native \
"

SRC_URI[md5sum] = "fb36ece9dede937e9ed73057f633b0a7"
SRC_URI[sha256sum] = "fe8941d7424911c4624379b2c0b2cff3efcd623b834c01fd66315a9da807b176"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-em-http \
    rubygems-faraday-em-synchrony \
    rubygems-faraday-excon \
    rubygems-faraday-httpclient \
    rubygems-faraday-net-http \
    rubygems-faraday-net-http-persistent \
    rubygems-faraday-patron \
    rubygems-faraday-rack \
    rubygems-multipart-post \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
