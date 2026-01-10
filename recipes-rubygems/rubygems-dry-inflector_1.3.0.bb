# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-inflector"
DESCRIPTION = "String inflections for dry-rb"
HOMEPAGE = "https://dry-rb.org/gems/dry-inflector"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1634aef032515aff051055c40a2760c4"
SRC_URI[sha256sum] = "441082dde958db39df7353c71e520c05732e8da9ace28c78da2d0f1d6c669fa3"

GEM_NAME = "dry-inflector"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
