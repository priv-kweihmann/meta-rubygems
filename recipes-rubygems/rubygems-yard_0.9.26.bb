# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yard"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language.    It enables the user to generate consistent, usable documentation that can be    exported to a number of formats very easily, and also supports extending for    custom Ruby constructs such as custom class level definitions."
HOMEPAGE = "http://yardoc.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=310fd4084d596f545cebfed7b54e3d7d"

SRC_URI[md5sum] = "0eff29921e52a7a422eee1574ede3d1d"
SRC_URI[sha256sum] = "30594aa05cf737aa725c73444c7be3d54a443d0e258e1503da4eb1a0822cf963"

GEM_NAME = "yard"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
