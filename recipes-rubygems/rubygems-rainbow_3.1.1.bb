# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rainbow"
DESCRIPTION = "Colorize printed text on ANSI terminals"
HOMEPAGE = "https://github.com/sickill/rainbow"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8b3dd1cdfc682803de86f82b443bcd3"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "acdea414d05a0d360e0fda6c26747156"
SRC_URI[sha256sum] = "039491aa3a89f42efa1d6dec2fc4e62ede96eb6acd95e52f1ad581182b79bc6a"

GEM_NAME = "rainbow"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
