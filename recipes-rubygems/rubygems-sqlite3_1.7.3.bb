# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sqlite3"
DESCRIPTION = "Ruby library to interface with the SQLite3 database engine (http://www.sqlite.org)"
HOMEPAGE = "https://github.com/sparklemotion/sqlite3-ruby"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f24ce0d57c8f8576a36e2803d35bcfec"

EXTRA_DEPENDS:append = " \
    sqlite3 \
"
EXTRA_RDEPENDS:append = " \
    sqlite3 \
"

DEPENDS:class-native += "\
    rubygems-mini-portile2-native \
"

GEM_INSTALL_FLAGS:append = " \
    -- \
    --enable-system-libraries \
    --platform=ruby \
"

SRC_URI[md5sum] = "8fc21e729d3710efec385f567a21de56"
SRC_URI[sha256sum] = "fa77f63c709548f46d4e9b6bb45cda52aa3881aa12cc85991132758e8968701c"

GEM_NAME = "sqlite3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # remove sqlite3 source code
    rm -rf ${D}${libdir}/ruby/gems/${GEMLIB_VERSION}/gems/${GEM_NAME}-${PV}/ports
}

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
"

BBCLASSEXTEND = "native"
