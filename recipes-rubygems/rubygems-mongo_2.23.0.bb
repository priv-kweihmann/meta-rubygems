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

SRC_URI[md5sum] = "f0982c5ff2e03467c4b1cd69aca6c698"
SRC_URI[sha256sum] = "be2fe4cc6f7119fa6b79e82a1963b2406856b4dc92d0ccfb74db543897be3109"

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
