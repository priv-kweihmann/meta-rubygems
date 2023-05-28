# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: recursive-open-struct"
DESCRIPTION = "RecursiveOpenStruct is a subclass of OpenStruct"
HOMEPAGE = "https://github.com/aetherknight/recursive-open-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cefab505e7fa3397fcf76646bf481046"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7df09c48b1109765e33f889c1a39d108"
SRC_URI[sha256sum] = "a3538a72552fcebcd0ada657bdff313641a4a5fbc482c08cfb9a65acb1c9de5a"

GEM_NAME = "recursive-open-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
