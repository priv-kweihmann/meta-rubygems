# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: pry-coolline"
DESCRIPTION = "Live syntax-highlighting for the Pry REPL"
HOMEPAGE = "https://github.com/pry/pry-coolline"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f21b4eb54b7e42d007467d6a15d5a82"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-coolline-native \
    rubygems-pry-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "55310f024b446a65841fe55f8f954fd3"
SRC_URI[sha256sum] = "a8e364207c59e87a4b88a92906417cbd3a9e7ec801176410a7abb3ce433a958f"

GEM_NAME = "pry-coolline"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-coolline \
    rubygems-pry \
"

BBCLASSEXTEND = "native"
