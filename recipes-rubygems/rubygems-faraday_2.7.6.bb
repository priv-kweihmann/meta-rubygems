# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=16803e44761e7ff8111818414be5e7ce"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-net-http-native \
    rubygems-ruby2-keywords-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bc12d52cfbf41cf241a8ce1b87cab336"
SRC_URI[sha256sum] = "83d5f0bfa6cad31ad62d6b13743b297359236abb8540d79e266163adff8a3d23"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
