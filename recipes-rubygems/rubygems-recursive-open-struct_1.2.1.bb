# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: recursive-open-struct"
DESCRIPTION = "RecursiveOpenStruct is a subclass of OpenStruct"
HOMEPAGE = "https://github.com/aetherknight/recursive-open-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cefab505e7fa3397fcf76646bf481046"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "18ad1601147618d1e8ca74355709cd35"
SRC_URI[sha256sum] = "961be6a327cd569ff6a71dcea2607d909f1f3c8b275172319f3e267412b7c4e2"

GEM_NAME = "recursive-open-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
