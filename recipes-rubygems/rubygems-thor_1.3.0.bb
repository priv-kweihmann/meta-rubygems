# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: thor"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
HOMEPAGE = "http://whatisthor.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=690cce21f4e069148a52834e1ecf352e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "234ad91e9c7b82126477cdd2cdd5c014"
SRC_URI[sha256sum] = "1adc7f9e5b3655a68c71393fee8bd0ad088d14ee8e83a0b73726f23cbb3ca7c3"

GEM_NAME = "thor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
