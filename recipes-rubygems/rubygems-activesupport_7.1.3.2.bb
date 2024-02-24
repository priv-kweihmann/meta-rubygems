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

SRC_URI[md5sum] = "8d15e79566d75f03eeed663c3cbe8bc9"
SRC_URI[sha256sum] = "ad8445b7ae4a6d3acc5f88c8c5f437eb0b54062032aaf44856c7b6d3855b8b2e"

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
