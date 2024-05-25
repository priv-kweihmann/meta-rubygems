# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rb-inotify"
DESCRIPTION = "A Ruby wrapper for Linux inotify, using FFI"
HOMEPAGE = "https://github.com/guard/rb-inotify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=98201cb3e99717097b99fa767e46ffbb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "366aded73b8d521b65ffe40489cea47f"
SRC_URI[sha256sum] = "a0a700441239b0ff18eb65e3866236cd78613d6b9f78fea1f9ac47a85e47be6e"

GEM_NAME = "rb-inotify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
