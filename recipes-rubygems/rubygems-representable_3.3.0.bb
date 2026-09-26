# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: representable"
DESCRIPTION = "Renders and parses JSON/XML/YAML documents from and to Ruby objects"
HOMEPAGE = "https://github.com/trailblazer/representable/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05037c2d4aa35dcc8c2db40a1b0e6a14"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-declarative-native \
    rubygems-trailblazer-option-native \
    rubygems-uber-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6a7f4a58ab63117ce9b346c1bcdbc01f"
SRC_URI[sha256sum] = "22beca7d07104d8dfe30667eb267756c764c8bdc6c0f1481922502ecc4f0d8cf"

GEM_NAME = "representable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-declarative \
    rubygems-trailblazer-option \
    rubygems-uber \
"

BBCLASSEXTEND = "native"
