# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-logic"
DESCRIPTION = "Predicate logic with rule composition"
HOMEPAGE = "https://dry-rb.org/gems/dry-logic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94642341bb0f18ae40ee66ef498a2777"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-dry-core-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "90784c65ae600fd732c2eb0341523e27"
SRC_URI[sha256sum] = "99ed2180f1970c3d8247004f277a01dffbe8e82cf6680de9c7209312d86cd416"

GEM_NAME = "dry-logic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
