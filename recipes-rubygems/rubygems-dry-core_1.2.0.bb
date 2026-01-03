# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-core"
DESCRIPTION = "A toolset of small support modules used throughout the dry-rb ecosystem"
HOMEPAGE = "https://dry-rb.org/gems/dry-core"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76fc550766ac9fc8e596a33c0fa08a52"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-logger-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "778ee880f88100924b91934052d50376"
SRC_URI[sha256sum] = "0cc5a7da88df397f153947eeeae42e876e999c1e30900f3c536fb173854e96a1"

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
