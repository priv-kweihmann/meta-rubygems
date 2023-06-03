# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: i18n"
DESCRIPTION = "New wave Internationalization support for Ruby."
HOMEPAGE = "https://github.com/ruby-i18n/i18n"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c0e4b0e10e0acf26e4e423343ccf78f8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9f4aecf481ca9f26aff969109dde45bb"
SRC_URI[sha256sum] = "2213e13931f9ff77c50ee0e91c7f811c3cde375fee68e7ffcd58e90291b47560"

GEM_NAME = "i18n"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
