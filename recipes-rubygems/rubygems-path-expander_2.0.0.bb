# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: path_expander"
DESCRIPTION = "PathExpander helps pre-process command-line arguments expandingdirectories into their constituent files"
HOMEPAGE = "https://github.com/seattlerb/path_expander"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://README.rdoc;beginline=51;endline=74;md5=5db85eba7780ac1765a03fe0e5ec1657 \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dd1d362d23560f2dbda5c0649a9316bb"
SRC_URI[sha256sum] = "8fcdb6da0a5d0214270168ab5a4e133a72375d52c7ad43d69e4e8120eeb06405"

GEM_NAME = "path_expander"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
