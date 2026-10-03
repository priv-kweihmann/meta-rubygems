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

SRC_URI[md5sum] = "903e8456fe534a5fabd3b3cbc4f7e9ef"
SRC_URI[sha256sum] = "8a5fc8eef99f598147eee0390f606386268b429a840419fcfd3f7a8ccc40f566"

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
