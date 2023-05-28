# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-inflector"
DESCRIPTION = "String inflections for dry-rb"
HOMEPAGE = "https://dry-rb.org/gems/dry-inflector"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5e0d4ed02bd05271907209b59901f70"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b7f9c2866eb175d0bd812b404ca1fefa"
SRC_URI[sha256sum] = "6ad22361ca2d6f3f001ae3037ffcfea01163f644280d13a9195d3c3a94dd1626"

GEM_NAME = "dry-inflector"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
