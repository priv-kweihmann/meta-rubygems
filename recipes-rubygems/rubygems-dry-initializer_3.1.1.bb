# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-initializer"
DESCRIPTION = "DSL for declaring params and options of the initializer"
HOMEPAGE = "https://dry-rb.org/gems/dry-initializer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5e0d4ed02bd05271907209b59901f70"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6477bb88b4719b229c419351e79e0cf3"
SRC_URI[sha256sum] = "4d267dea367ccabe498b259c62b909b99d577d6db547d9510561999403546dec"

GEM_NAME = "dry-initializer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
