# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-core"
DESCRIPTION = "A toolset of small support modules used throughout the dry-rb ecosystem"
HOMEPAGE = "https://dry-rb.org/gems/dry-core"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-logger-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9577ac8a32b5c3bb0a67c2b41c95997e"
SRC_URI[sha256sum] = "0903821a9707649a7da545a2cd88e20f3a663ab1c5288abd7f914fa7751ab195"

GEM_NAME = "dry-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-logger \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
