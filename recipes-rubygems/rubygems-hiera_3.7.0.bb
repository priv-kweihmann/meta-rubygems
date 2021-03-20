# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hiera"
DESCRIPTION = "A pluggable data store for hierarcical data"
HOMEPAGE = "https://github.com/puppetlabs/hiera"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=67c01e92d4ae704f266de057db62d718"

SRC_URI[md5sum] = "24fd0b1e4f449d09a81bf7688e0dcbde"
SRC_URI[sha256sum] = "0a5dd57f260a7fb86d1326c060a7c0061e9dd9a6dee3fbc8187a53b2d6532bbc"

GEM_NAME = "hiera"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
