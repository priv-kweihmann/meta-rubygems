# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: logging"
DESCRIPTION = "**Logging** is a flexible logging library for use in Ruby programs based on thedesign of Java's log4j library"
HOMEPAGE = "http://rubygems.org/gems/logging"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=463bc6a3a5b0c037d4198dcd82deddd8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-little-plugger-native \
    rubygems-multi-json-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8953eab63c979ecdac781cbf0da1872a"
SRC_URI[sha256sum] = "ba8893a3c211b836f4131bb93b3eb3137a0c3b1fcd0ec3d570e324d8bdc00ccb"

GEM_NAME = "logging"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-little-plugger \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
