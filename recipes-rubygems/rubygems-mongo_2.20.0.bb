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

SRC_URI[md5sum] = "56f69fe1a9edd3007f090fefcde50974"
SRC_URI[sha256sum] = "a6a697c855738d91695db081caef466b27ee799388731b0564bac5546a5b635d"

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
