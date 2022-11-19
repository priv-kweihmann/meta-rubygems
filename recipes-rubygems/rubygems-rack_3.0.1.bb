# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rack"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developingweb applications in Ruby"
HOMEPAGE = "https://github.com/rack/rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=559f57f8685653f279d80fa9bc84df1b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "54b46f38b1470c8cce9675683fffeded"
SRC_URI[sha256sum] = "0fe3e8d68b2a4684bcdff0b1fecb0a5e201b7ea3f6fac868fa18d596035eff3c"

GEM_NAME = "rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
