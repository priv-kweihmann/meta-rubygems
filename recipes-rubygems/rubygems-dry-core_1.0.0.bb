# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-core"
DESCRIPTION = "A toolset of small support modules used throughout the dry-rb ecosystem"
HOMEPAGE = "https://dry-rb.org/gems/dry-core"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94642341bb0f18ae40ee66ef498a2777"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6ef58e20f567cc77fc2951405b02db15"
SRC_URI[sha256sum] = "7a92099870967f0d2c9997950608cb8bb622dafeea20b2fe1dd49e9ba1d0f305"

GEM_NAME = "dry-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
