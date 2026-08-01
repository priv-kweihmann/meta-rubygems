# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=bd242b91e0fedcb6ec51782cf8914ee5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-bigdecimal-native \
    rubygems-concurrent-ruby-native \
    rubygems-connection-pool-native \
    rubygems-drb-native \
    rubygems-i18n-native \
    rubygems-json-native \
    rubygems-logger-native \
    rubygems-minitest-native \
    rubygems-securerandom-native \
    rubygems-tzinfo-native \
    rubygems-uri-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dddd1dd13684450864474693ca05144a"
SRC_URI[sha256sum] = "85458765f25ea48b9019c46b6bb3fa5683197bf4280d9f06710a6e8d7a831376"

GEM_NAME = "activesupport"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-bigdecimal \
    rubygems-concurrent-ruby \
    rubygems-connection-pool \
    rubygems-drb \
    rubygems-i18n \
    rubygems-json \
    rubygems-logger \
    rubygems-minitest \
    rubygems-securerandom \
    rubygems-tzinfo \
    rubygems-uri \
"

BBCLASSEXTEND = "native"
