# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yard"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language.    It enables the user to generate consistent, usable documentation that can be    exported to a number of formats very easily, and also supports extending for    custom Ruby constructs such as custom class level definitions."
HOMEPAGE = "http://yardoc.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b6f9769ae84eb7b621febf5cc8c5c62"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "37724c72d0ccfef6e9204ffb3bff226e"
SRC_URI[sha256sum] = "a6e910399e78e613f80ba9add9ba7c394b1a935f083cccbef82903a3d2a26992"

GEM_NAME = "yard"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
