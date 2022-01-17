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

SRC_URI[md5sum] = "c56e7d72fc0fa5daea6cfdba47fb94ae"
SRC_URI[sha256sum] = "2c4a378ba807dd5e360982d383584272cab4a0d682d097026df1167f516dfc5d"

GEM_NAME = "faraday-httpclient"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-httpclient \
"

BBCLASSEXTEND = "native"
