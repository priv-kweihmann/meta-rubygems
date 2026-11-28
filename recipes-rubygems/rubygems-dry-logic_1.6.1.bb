# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-logic"
DESCRIPTION = "Predicate logic with rule composition"
HOMEPAGE = "https://dry-rb.org/gems/dry-logic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
    rubygems-concurrent-ruby-native \
    rubygems-dry-core-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f274f67a2fb51f403973f470b46c6583"
SRC_URI[sha256sum] = "3cea14d2108b62f1a99d20b993dff3a5c365136a3995202fd33d9a163baedd31"

GEM_NAME = "dry-logic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-concurrent-ruby \
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
