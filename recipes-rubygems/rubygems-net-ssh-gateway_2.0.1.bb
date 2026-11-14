# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ssh-gateway"
DESCRIPTION = "A simple library to assist in establishing tunneled Net::SSH connections"
HOMEPAGE = "https://github.com/net-ssh/net-ssh-gateway"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-net-ssh-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "66fb5fdb518d9e85c3892ae1ca0dcb9d"
SRC_URI[sha256sum] = "1da6bdea2ab282ca048d16a0e6e30e85f4d0549d39fe2133a730ae7e2046d81a"

GEM_NAME = "net-ssh-gateway"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
