# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: path_expander"
DESCRIPTION = "PathExpander helps pre-process command-line arguments expandingdirectories into their constituent files"
HOMEPAGE = "https://github.com/seattlerb/path_expander"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=51;endline=74;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3f1a2d1e783a798afb5d1947b816e5e0"
SRC_URI[sha256sum] = "85ce6e0375bbf83e090a02f0d45dfc0b4ed240c0e5c65f1e5dfdc11f5503231f"

GEM_NAME = "path_expander"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
