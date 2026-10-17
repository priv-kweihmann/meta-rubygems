# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tomlrb"
DESCRIPTION = "Parses TOML 1.1 and 1.0 documents into Ruby Hashes"
HOMEPAGE = "https://github.com/fbernier/tomlrb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=856e05d07fd1d066ea36fe4f682920f3"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "587105874453a2dc0b4b92e9db9f8262"
SRC_URI[sha256sum] = "e7122820cbb9b940d1758eecb6d1d4ee97c582efa37f06e0100a97cb17a566f5"

GEM_NAME = "tomlrb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
