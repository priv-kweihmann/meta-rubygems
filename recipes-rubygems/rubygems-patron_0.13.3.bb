# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: patron"
DESCRIPTION = "Ruby HTTP client library based on libcurl"
HOMEPAGE = "https://github.com/toland/patron"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d7a84af80205b598ee5f47cab7eabb3"

EXTRA_DEPENDS:append = " curl"
EXTRA_RDEPENDS:append = " curl"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "69584a878e6fa832d9d14713980a2fbc"
SRC_URI[sha256sum] = "29ba41f9e936b54a41726cfebbfc464c09ff8099a51883aba0f823d45b7b4314"

GEM_NAME = "patron"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
