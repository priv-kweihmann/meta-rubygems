# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-initializer"
DESCRIPTION = "DSL for declaring params and options of the initializer"
HOMEPAGE = "https://dry-rb.org/gems/dry-initializer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37edfa9e6028fdbd3411ffc59f7cdfa3"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "38a9673eb92887d32ded57ea09097d1e"
SRC_URI[sha256sum] = "37d59798f912dc0a1efe14a4db4a9306989007b302dcd5f25d0a2a20c166c4e3"

GEM_NAME = "dry-initializer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
