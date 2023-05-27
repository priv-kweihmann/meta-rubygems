# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=c4df0cf970eec55a9d2006485982d245"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-i18n-native \
    rubygems-minitest-native \
    rubygems-tzinfo-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "096bc432e3e178b60583034dec729a01"
SRC_URI[sha256sum] = "d58f62bf992ffe1c0efdaedc6edf1a94fdd3cfcecbca80098de587514c2cf3b0"

GEM_NAME = "activesupport"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-i18n \
    rubygems-minitest \
    rubygems-tzinfo \
"

BBCLASSEXTEND = "native"
