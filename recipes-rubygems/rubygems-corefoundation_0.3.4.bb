# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: corefoundation"
DESCRIPTION = "Ruby wrapper for macOS Core Foundation framework"
HOMEPAGE = "http://github.com/chef/corefoundation"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1814884814f0a48dea9ee270f29af6f6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " libffi"

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b67d0b8580e22ecc9fba8fe65fff1b14"
SRC_URI[sha256sum] = "26e1a17c0bcf8db959dad25c85a4bbed280043981bf9ab29f0c5e2e8121dc755"

GEM_NAME = "corefoundation"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
