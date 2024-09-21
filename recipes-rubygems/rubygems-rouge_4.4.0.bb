# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "MIT & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=548cf784d6d431718abbb22a2eb5cdbe"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0ae620df8de5931fff2032d662448bf2"
SRC_URI[sha256sum] = "7a6d6d951e3202e4ce3926838625fa6edeb35680e6d1e3817f53c14212220b64"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
