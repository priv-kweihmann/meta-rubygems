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

SRC_URI[md5sum] = "5c4500f80d2f34d04ec965c6830ad0bc"
SRC_URI[sha256sum] = "e93190d0c184b5c14858e4239a61fe255b2eae86e04bf9590afb962b85a5fa5d"

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
