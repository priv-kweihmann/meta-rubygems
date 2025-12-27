# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tomlrb"
DESCRIPTION = "A racc based toml parser"
HOMEPAGE = "https://github.com/fbernier/tomlrb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=856e05d07fd1d066ea36fe4f682920f3"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "219a7723c355f4e7ffaaa963def84915"
SRC_URI[sha256sum] = "262f77947ac3ac9b3366a0a5940ecd238300c553e2e14f22009e2afcd2181b99"

GEM_NAME = "tomlrb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
