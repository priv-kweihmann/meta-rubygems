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

SRC_URI[md5sum] = "8cff3d88d8787263585bc8106cf0e192"
SRC_URI[sha256sum] = "6109148e6a6e656607510b74571deff8ecd9a97ab0dcec9b7431bdd0b74460af"

GEM_NAME = "mime-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-mime-types-data \
"

BBCLASSEXTEND = "native"
