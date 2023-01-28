# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multipart-post"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
HOMEPAGE = "https://github.com/socketry/multipart-post"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=3dc66ef212fde3c72a46c033bcd535ab"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "067cd7270a1f476ce71454d499213671"
SRC_URI[sha256sum] = "3dcdd74a767302559fcf91a63b568ee00770494ce24195167b1c147ab3f6fe51"

GEM_NAME = "multipart-post"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
