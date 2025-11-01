# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mixlib-archive"
DESCRIPTION = "A simple interface to various archive formats"
HOMEPAGE = "https://github.com/chef/mixlib-archive"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3edf03f3aa19ea46e101aa4b956c206"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-mixlib-log-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "74d22a6ebcf5e52bcf2b0d50e5e60bc6"
SRC_URI[sha256sum] = "1e66ec255ee60a21a35633c5c657ba5e0712039aaa3dcf948c726af179987056"

GEM_NAME = "mixlib-archive"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mixlib-log \
"

BBCLASSEXTEND = "native"
