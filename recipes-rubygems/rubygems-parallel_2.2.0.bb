# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parallel"
DESCRIPTION = "Run any kind of code in parallel processes"
HOMEPAGE = "https://github.com/grosser/parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=01d743313af3f7a981bcce70a74e06c2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f99a5f4a0388d1304eae92a02fcd5bbf"
SRC_URI[sha256sum] = "e1059c5fd7b649558a0aec38a769f06a42942bdb40503d005a59c352fe011cd8"

GEM_NAME = "parallel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
