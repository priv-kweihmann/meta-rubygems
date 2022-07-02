# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rack"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developingweb applications in Ruby"
HOMEPAGE = "https://github.com/rack/rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=7a785c27e4c8649ea0fab2dfe7219d55"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8adda585ad9eed36e7c90a3116832328"
SRC_URI[sha256sum] = "ea2232b638cbd919129c8c8ad8012ecaccc09f848152a7e705d2139d0137ac2b"

GEM_NAME = "rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
