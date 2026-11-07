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

SRC_URI[md5sum] = "852a243951af9ad2c0a7f41b462b122a"
SRC_URI[sha256sum] = "16ac4f341ca65c85a1fcdb8ac73f68891aae9e3c4a6f9c3a27daed8b00017ed7"

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
