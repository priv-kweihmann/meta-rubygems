# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashie"
DESCRIPTION = "Hashie is a collection of classes and mixins that make hashes more powerful."
HOMEPAGE = "https://github.com/hashie/hashie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=47599a13a6bc4e4df95b6c7354c961ce"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "39e4ebfcd60311fa48a0fc7a87d46c12"
SRC_URI[sha256sum] = "9d6c4e51f2a36d4616cbc8a322d619a162d8f42815a792596039fc95595603da"

GEM_NAME = "hashie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
