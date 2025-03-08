# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rack"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developingweb applications in Ruby"
HOMEPAGE = "https://github.com/rack/rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=559f57f8685653f279d80fa9bc84df1b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "edfa2fa56b53a83e1732c5072d2e51cf"
SRC_URI[sha256sum] = "2b1111a754890d57e7bccefe3a8be28c0f9c02b43433b5a1276c07773e16e8f7"

GEM_NAME = "rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
