# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rack"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developingweb applications in Ruby"
HOMEPAGE = "https://github.com/rack/rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=559f57f8685653f279d80fa9bc84df1b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1f941291691d501be7dda78c51a64fbe"
SRC_URI[sha256sum] = "00d83055c89273eb13679ab562767b8826955aa6c4371d7d161deb975c50c540"

GEM_NAME = "rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
