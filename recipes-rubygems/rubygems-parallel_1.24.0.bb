# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parallel"
DESCRIPTION = "Run any kind of code in parallel processes"
HOMEPAGE = "https://github.com/grosser/parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=01d743313af3f7a981bcce70a74e06c2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "92098507dc6a85dba1b7b51b753c80ca"
SRC_URI[sha256sum] = "5bf38efb9b37865f8e93d7a762727f8c5fc5deb19949f4040c76481d5eee9397"

GEM_NAME = "parallel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
