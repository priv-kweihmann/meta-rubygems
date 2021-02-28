# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: path_expander"
DESCRIPTION = "PathExpander helps pre-process command-line arguments expandingdirectories into their constituent files"
HOMEPAGE = "https://github.com/seattlerb/path_expander"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=51;endline=74;md5=5db85eba7780ac1765a03fe0e5ec1657"

SRC_URI[md5sum] = "dcf4aae5c127cfd3ecc2f5271c13c5f8"
SRC_URI[sha256sum] = "fb81a1f665f17579f8b450412e79009809584e25dab154cb5c88a59222b280d0"

GEM_NAME = "path_expander"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
