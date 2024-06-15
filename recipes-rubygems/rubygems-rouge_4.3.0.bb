# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "MIT & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=548cf784d6d431718abbb22a2eb5cdbe"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "874c90f48d974205a0df934171c9ba71"
SRC_URI[sha256sum] = "9ee3d9ec53338e78c03fff0cbcd08881d80d69152349b046761e48ccf2de581c"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
