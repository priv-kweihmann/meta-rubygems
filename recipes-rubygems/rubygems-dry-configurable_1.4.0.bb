# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-configurable"
DESCRIPTION = "A mixin to add configuration functionality to your classes"
HOMEPAGE = "https://dry-rb.org/gems/dry-configurable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-dry-core-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9a2b3ccc909da6f3f57bb3ff21518d1f"
SRC_URI[sha256sum] = "e35d1b5f3c081753ef361f564919db79000f32cfa6f20ee3a3ba5921b41b73ce"

GEM_NAME = "dry-configurable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
