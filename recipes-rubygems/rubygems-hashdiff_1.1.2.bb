# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashdiff"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes"
HOMEPAGE = "https://github.com/liufengyun/hashdiff"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c10cc38b516520cc860825a29852508"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "78fefe4abadc05823ba172cc48ce827b"
SRC_URI[sha256sum] = "2c30eeded6ed3dce8401d2b5b99e6963fe5f14ed85e60dd9e33c545a44b71a77"

GEM_NAME = "hashdiff"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
