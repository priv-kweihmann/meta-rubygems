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

SRC_URI[md5sum] = "f5eebc8943d3fda924189a85bf76157d"
SRC_URI[sha256sum] = "58d55da6308160d042ab78e9e3926b31e7deaa130893ca0b731010caa8dd27bb"

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
