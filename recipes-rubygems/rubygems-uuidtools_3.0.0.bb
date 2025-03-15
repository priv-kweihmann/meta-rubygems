# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: uuidtools"
DESCRIPTION = "A simple universally unique ID generation library."
HOMEPAGE = "https://github.com/sporkmonger/uuidtools"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f124bfaefacd4e1a4080065d403bc1d4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a5d65b2905672dc6ce04fc2cbdae92fb"
SRC_URI[sha256sum] = "47a3d4d20e728f522c675be8bc4e001252db39864c97deb194dc543b153a4be8"

GEM_NAME = "uuidtools"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
