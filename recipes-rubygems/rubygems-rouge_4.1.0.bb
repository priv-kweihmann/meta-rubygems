# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "MIT & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=548cf784d6d431718abbb22a2eb5cdbe"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "95f838b89350adc7988e5930eedcfd5b"
SRC_URI[sha256sum] = "0f6fc19a0d66db782f6fa67f56356af4ef001cd43bbd8ad5aa798a081de4dd10"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
