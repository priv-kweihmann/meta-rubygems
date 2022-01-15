# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-net-http-native \
    rubygems-ruby2-keywords-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fadf9237a3a488a3256e82cfa6399a81"
SRC_URI[sha256sum] = "a3aa9a2275ee07d843fae755790544290b36f2e5f4c429a1005d631f8e1c499d"

GEM_NAME = "faraday"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-net-http \
    rubygems-ruby2-keywords \
"

BBCLASSEXTEND = "native"
