# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

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

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "71d79df5b2b52212b84fe293e505d20b"
SRC_URI[sha256sum] = "47451a77df07e9a757ce805c47d804e78ae0b544d587e15e42965ac4c1c69829"

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
