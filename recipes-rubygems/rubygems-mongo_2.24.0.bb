# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mongo"
DESCRIPTION = "A pure-Ruby driver for connecting to, querying, and manipulating MongoDBdatabases"
HOMEPAGE = "https://mongodb.com/docs/ruby-driver/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c794e202c4ddf604ec533d391ee6775"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-bson-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "141b84b2a1ed74a310cb0b1f87296fa6"
SRC_URI[sha256sum] = "ff23d23157dc4a1f90f162625460d973b7ffa89ee78e6bb45a6003b3f5a67190"

GEM_NAME = "mongo"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_compile:prepend() {
    sed -i 's#"spec/support/ocsp".freeze,##g' ${GEM_SPEC_FILE}
}

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-bson \
"

BBCLASSEXTEND = "native"
