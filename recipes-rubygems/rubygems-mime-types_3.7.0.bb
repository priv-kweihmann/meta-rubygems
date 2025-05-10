# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types"
DESCRIPTION = "The mime-types library provides a library and registry for information aboutMIME content type definitions"
HOMEPAGE = "https://github.com/mime-types/ruby-mime-types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=a912a41e2b40daec7c7f8529fabeed22"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
    rubygems-mime-types-data-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0c46cdaea5780d783cd5059f3f0ebf14"
SRC_URI[sha256sum] = "dcebf61c246f08e15a4de34e386ebe8233791e868564a470c3fe77c00eed5e56"

GEM_NAME = "mime-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-mime-types-data \
"

BBCLASSEXTEND = "native"
