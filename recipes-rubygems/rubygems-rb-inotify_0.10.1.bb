# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rb-inotify"
DESCRIPTION = "A Ruby wrapper for Linux inotify, using FFI"
HOMEPAGE = "https://github.com/guard/rb-inotify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=98201cb3e99717097b99fa767e46ffbb"

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

SRC_URI[md5sum] = "ade741fff16c0fd7b8c3117219170543"
SRC_URI[sha256sum] = "050062d4f31d307cca52c3f6a7f4b946df8de25fc4bd373e1a5142e41034a7ca"

GEM_NAME = "rb-inotify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
