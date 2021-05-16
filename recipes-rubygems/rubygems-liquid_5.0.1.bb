# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: liquid"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
HOMEPAGE = "http://www.liquidmarkup.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2a65a7b0b338ce2e5c688284735d982"

SRC_URI[md5sum] = "c6e491e43afa7962ee8421d4a3e25f4e"
SRC_URI[sha256sum] = "745771f725b8f6541c4ed942755cb43b7b8d7bb4d4ab9437ba074cebd95772d8"

GEM_NAME = "liquid"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
