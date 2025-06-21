# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-httpclient"
DESCRIPTION = "Faraday adapter for HTTPClient"
HOMEPAGE = "https://github.com/lostisland/faraday-httpclient"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-httpclient-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "014940e33e1f9bdb5d1e6dfa203f8b01"
SRC_URI[sha256sum] = "d95fbe60cce5a87e157957d67c539a4c22fb8b0b0611d493a939cdde19d8d67c"

GEM_NAME = "faraday-httpclient"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-httpclient \
"

BBCLASSEXTEND = "native"
