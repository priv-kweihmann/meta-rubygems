# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media type definitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=a70d2451e1eb642e8b1c3006ee136d09"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "90b0ac5225e5a10ab30e438a0a6caf94"
SRC_URI[sha256sum] = "9de2a6bafa27a8b90b09174fe43e24f31480971f8dd652f8c48be880d430df42"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
