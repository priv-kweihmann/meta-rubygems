# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=a70d2451e1eb642e8b1c3006ee136d09"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "250771a218a626c4d573d81bd3ac3299"
SRC_URI[sha256sum] = "3632d6a08f6ff832ef1181365b24cfe365b82a97c47ff76d5ae363d6d695aedc"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
