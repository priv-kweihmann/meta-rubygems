# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: path_expander"
DESCRIPTION = "PathExpander helps pre-process command-line arguments expandingdirectories into their constituent files"
HOMEPAGE = "https://github.com/seattlerb/path_expander"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=51;endline=74;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b13ab74cfb953222186ea59c761c9b93"
SRC_URI[sha256sum] = "284dcf941d2b83c738459e82d93b4328c0c3dec13cffd2f2b0fb351987de15ef"

GEM_NAME = "path_expander"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
