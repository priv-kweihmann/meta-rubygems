# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=a70d2451e1eb642e8b1c3006ee136d09"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "68b54ad793770ba3d33a0aff3aa31b2c"
SRC_URI[sha256sum] = "cda7af94d895f1fd33e000acea800e6ed31e4c861e3d6c1a27c8b74f9e44dc64"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
