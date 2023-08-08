# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_mime"
DESCRIPTION = "A minimal mime type library"
HOMEPAGE = "https://github.com/discourse/mini_mime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4778dbd817e04a19ab6050d5e59bb853"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "efdc9d225e0edc178ad8bc244933bea3"
SRC_URI[sha256sum] = "8681b7e2e4215f2a159f9400b5816d85e9d8c6c6b491e96a12797e798f8bccef"

GEM_NAME = "mini_mime"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
