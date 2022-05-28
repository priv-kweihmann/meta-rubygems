# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tomlrb"
DESCRIPTION = "A racc based toml parser"
HOMEPAGE = "https://github.com/fbernier/tomlrb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=856e05d07fd1d066ea36fe4f682920f3"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "35b90995c47e2cd3a9097d16864a6c85"
SRC_URI[sha256sum] = "7963170624cf26ecec40ae41200c3b1353553ed7864f1106f34b78198f5e0bd1"

GEM_NAME = "tomlrb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
