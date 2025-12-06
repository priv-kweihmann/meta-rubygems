# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sqlite3"
DESCRIPTION = "Ruby library to interface with the SQLite3 database engine (http://www.sqlite.org)"
HOMEPAGE = "https://github.com/sparklemotion/sqlite3-ruby"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=048bdd172fbcbf66b755f0171400090f"

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

SRC_URI[md5sum] = "64b73a643f09a21cec26a82c58d708d2"
SRC_URI[sha256sum] = "acd0ac7912a4d92b2484b5befb6faa8d496497eb1e38bdbe8d7818fb8d05d726"

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

INSANE_SKIP:${PN} += "rpaths ldflags"

BBCLASSEXTEND = "native"
