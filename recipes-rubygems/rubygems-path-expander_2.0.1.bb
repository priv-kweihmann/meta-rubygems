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

SRC_URI[md5sum] = "c543ce3a99ec35301dab9011e3833656"
SRC_URI[sha256sum] = "2de201164bff4719cc4d0b3767286e9977cc832a59c4d70abab571ec86cb41e4"

GEM_NAME = "path_expander"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
