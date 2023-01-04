# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mongo"
DESCRIPTION = "A Ruby driver for MongoDB"
HOMEPAGE = "https://mongodb.com/docs/ruby-driver/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c794e202c4ddf604ec533d391ee6775"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bson-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "77a7de914f847f634a6a9a80e2d6dd8e"
SRC_URI[sha256sum] = "769ee6caf8675b42f24bcb13930e97ca64db87157bb51d5a3eb6ed07b167b7d1"

GEM_NAME = "mongo"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_compile:prepend() {
    sed -i 's#"spec/support/ocsp".freeze,##g' ${GEM_SPEC_FILE}
}

RDEPENDS:${PN}:class-target += "\
    rubygems-bson \
"

BBCLASSEXTEND = "native"
