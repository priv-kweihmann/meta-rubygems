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
    rubygems-minitest-native \
    rubygems-mutex-m-native \
    rubygems-tzinfo-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a0854433c64f9f1ec573d96e2e3dd053"
SRC_URI[sha256sum] = "455bbc43d82e5ba20daa25f0888b80c9f7e2d80ca0cc96cea3e6acfec3e40309"

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
    rubygems-minitest \
    rubygems-mutex-m \
    rubygems-tzinfo \
"

BBCLASSEXTEND = "native"
