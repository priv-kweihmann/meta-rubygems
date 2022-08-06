# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "MIT & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=548cf784d6d431718abbb22a2eb5cdbe"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2a890fcc6de05576405505e92bab91a5"
SRC_URI[sha256sum] = "a3d353222aa72e49e2c86726c0bcfd719f82592f57d494474655f48e669eceb6"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
