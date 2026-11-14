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

SRC_URI[md5sum] = "28a9947ce1a29bb09154dfba5559b4c1"
SRC_URI[sha256sum] = "0896391e9fc7a259bfe02abbb1a026b3e142e2f464e10255261d50a0eda18e3e"

GEM_NAME = "hashie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
"

BBCLASSEXTEND = "native"
