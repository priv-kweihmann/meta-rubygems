# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unf_ext"
DESCRIPTION = "Unicode Normalization Form support library for CRuby"
HOMEPAGE = "https://github.com/knu/ruby-unf_ext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eeabce56bdb2bf10564523e7b9e42412"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c786b898d2f126f87e6c7125f3f7f488"
SRC_URI[sha256sum] = "90b9623ee359cc4878461c5d2eab7d3d3ce5801a680a9e7ac83b8040c5b742fa"

GEM_NAME = "unf_ext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
