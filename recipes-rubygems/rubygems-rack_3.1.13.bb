# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rack"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developingweb applications in Ruby"
HOMEPAGE = "https://github.com/rack/rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=559f57f8685653f279d80fa9bc84df1b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9e1c6d5c68cfde6952adec0ce832326a"
SRC_URI[sha256sum] = "170c79db621882884d9a28d9cd5bd228c663fddcd367c4dea22c9a1808645792"

GEM_NAME = "rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
