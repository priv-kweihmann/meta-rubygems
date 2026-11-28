# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashdiff"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes"
HOMEPAGE = "https://github.com/liufengyun/hashdiff"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c10cc38b516520cc860825a29852508"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a9e4eda80b1d29d56ae4171e088ac9cf"
SRC_URI[sha256sum] = "0b6724b8f3fef3961acc09489b175698ce0b7fd22c9cc5aa559d280cc6b65649"

GEM_NAME = "hashdiff"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
