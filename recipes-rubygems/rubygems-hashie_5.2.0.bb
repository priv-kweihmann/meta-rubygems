# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hashie"
DESCRIPTION = "Hashie is a collection of classes and mixins that make hashes more powerful."
HOMEPAGE = "https://github.com/hashie/hashie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=47599a13a6bc4e4df95b6c7354c961ce"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d17826722e1807e760c575db2851a53b"
SRC_URI[sha256sum] = "357a22635195c2e3911fbbc3de9a7d528843d1f42ab0aae02171048f16332d72"

GEM_NAME = "hashie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
"

BBCLASSEXTEND = "native"
