# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: codeclimate-engine-rb"
DESCRIPTION = "JSON issue formatter for the Code Climate engine"
HOMEPAGE = "https://github.com/andyw8/codeclimate-engine-rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56b47d379805ed45bc0c1aff19d7364b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " \
    bash \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "681c9dd6109886b5c95617cb2f6efba7"
SRC_URI[sha256sum] = "68e2449b1bc97936bc27108cc31bcbbbb7e8b5bad650ee22aa34f272fad60fcc"

GEM_NAME = "codeclimate-engine-rb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
