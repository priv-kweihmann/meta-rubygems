# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mongo"
DESCRIPTION = "A Ruby driver for MongoDB"
HOMEPAGE = "https://docs.mongodb.com/ruby-driver/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c794e202c4ddf604ec533d391ee6775"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bson-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "68832be6fd4b5b8acf9f134199e4b79f"
SRC_URI[sha256sum] = "2cdb0967a74408bb5a077bd012dceafa843775828f914d1e61c73e3b8ed9a466"

GEM_NAME = "mongo"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bson \
"

BBCLASSEXTEND = "native"
