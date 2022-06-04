# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tomlrb"
DESCRIPTION = "A racc based toml parser"
HOMEPAGE = "https://github.com/fbernier/tomlrb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=856e05d07fd1d066ea36fe4f682920f3"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1b0bf7da1c67e0fb0092083ee7d00993"
SRC_URI[sha256sum] = "c2736acf24919f793334023a4ff396c0647d93fce702a73c9d348deaa815d4f7"

GEM_NAME = "tomlrb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
