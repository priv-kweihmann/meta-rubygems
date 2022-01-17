# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-patron"
DESCRIPTION = "Faraday adapter for Patron"
HOMEPAGE = "https://github.com/lostisland/faraday-patron"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-patron-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0badd26538bdd103b20e45eaeee6004a"
SRC_URI[sha256sum] = "bfd6eeaff9af1ae2cd4c097b66daa01df3fcb615c4cbf5fd19b48fec007b5869"

GEM_NAME = "faraday-patron"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-patron \
"

BBCLASSEXTEND = "native"
