# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sqlite3"
DESCRIPTION = "Ruby library to interface with the SQLite3 database engine (http://www.sqlite.org)"
HOMEPAGE = "https://github.com/sparklemotion/sqlite3-ruby"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f24ce0d57c8f8576a36e2803d35bcfec"

EXTRA_DEPENDS:append = " sqlite3"
EXTRA_RDEPENDS:append = " sqlite3"

DEPENDS:class-native += "\
    rubygems-mini-portile2-native \
"

GEM_INSTALL_FLAGS:append = " \
    --platform=ruby -- \
    --enable-system-libraries \
"

SRC_URI[md5sum] = "792ea16701e163ba4f49f18d296d3509"
SRC_URI[sha256sum] = "16050775fea3095035c8d4cb33968523e8ef411ac2d6bfa5f27d4c2b119cfd8c"

GEM_NAME = "sqlite3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
"

BBCLASSEXTEND = "native"
