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

SRC_URI[md5sum] = "aa68d0efd2a736faca840a1e6e72448e"
SRC_URI[sha256sum] = "cc29bf7eebc31653586849371a43ffe36c60b54b0a6365b5f7d95ec34d1ebace"

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
