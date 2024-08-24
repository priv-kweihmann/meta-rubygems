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
    rubygems-logger-native \
    rubygems-minitest-native \
    rubygems-securerandom-native \
    rubygems-tzinfo-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3c105cb460a69d3a80794d4a49b119d1"
SRC_URI[sha256sum] = "7557fa077a592a4f36f7ddacf4d9d71c34aff69ed20236b8a61c22d567da8c24"

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
    rubygems-logger \
    rubygems-minitest \
    rubygems-securerandom \
    rubygems-tzinfo \
"

BBCLASSEXTEND = "native"
