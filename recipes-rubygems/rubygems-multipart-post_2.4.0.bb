# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multipart-post"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
HOMEPAGE = "https://github.com/socketry/multipart-post"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=18276da62cdadda4675dbf0abecf9c02"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "626fd8b3f8cd080c1eccfa0e25d7bfed"
SRC_URI[sha256sum] = "c7c48ce6cd32cd7a3bf5fa58fed39cf58e90f75a526de24fbaa91913cab86380"

GEM_NAME = "multipart-post"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
