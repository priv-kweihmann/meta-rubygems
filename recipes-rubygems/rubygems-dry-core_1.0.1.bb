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
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "42b3d7f9ecec8659e9bfa2d190433c3e"
SRC_URI[sha256sum] = "f32f4245e0f54e787f3708584ed8f7545aaf8dd99072e36f169312468ec5450d"

GEM_NAME = "dry-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
