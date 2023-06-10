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

SRC_URI[md5sum] = "d4864a5fce06f0995f3dfbdc81647723"
SRC_URI[sha256sum] = "9d03698903547c060928e70a9bc8b6b87fda674453cda918fc7ab80235ae4a61"

GEM_NAME = "i18n"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
