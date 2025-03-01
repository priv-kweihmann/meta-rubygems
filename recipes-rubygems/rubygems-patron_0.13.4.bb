# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: patron"
DESCRIPTION = "Ruby HTTP client library based on libcurl"
HOMEPAGE = "https://github.com/toland/patron"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d7a84af80205b598ee5f47cab7eabb3"

EXTRA_DEPENDS:append = " \
    curl \
"
EXTRA_RDEPENDS:append = " \
    curl \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e48254c06e030b24eb274a01dc4d0f3b"
SRC_URI[sha256sum] = "c4ae37404a028772541e2f19a71e19be970aa53fdf8a3d70c5a9c1350bab3b09"

GEM_NAME = "patron"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
