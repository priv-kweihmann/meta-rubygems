# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yard"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language.    It enables the user to generate consistent, usable documentation that can be    exported to a number of formats very easily, and also supports extending for    custom Ruby constructs such as custom class level definitions."
HOMEPAGE = "https://yardoc.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2d3f20fac408cd2cc85eebdaa5e74c9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fe229b8dd348ac6c48ecc5ee076999e0"
SRC_URI[sha256sum] = "9b1ee37b5da942811dc584d8bb2dfd0efca0a72c44be30bf8282c34955902855"

GEM_NAME = "yard"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
