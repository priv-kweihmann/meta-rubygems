# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yard"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language.    It enables the user to generate consistent, usable documentation that can be    exported to a number of formats very easily, and also supports extending for    custom Ruby constructs such as custom class level definitions."
HOMEPAGE = "https://yardoc.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2d3f20fac408cd2cc85eebdaa5e74c9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "af6d30d685f5d23b93daba83e7b8ac14"
SRC_URI[sha256sum] = "52e211493f7cb8a3ebf7e104a25a1e73937a3103092545d34cb88fafebb3dc51"

GEM_NAME = "yard"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
