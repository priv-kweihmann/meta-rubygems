# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unf_ext"
DESCRIPTION = "Unicode Normalization Form support library for CRuby"
HOMEPAGE = "https://github.com/knu/ruby-unf_ext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eeabce56bdb2bf10564523e7b9e42412"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "21e2d17d515bd0de6f6e0900fda908ca"
SRC_URI[sha256sum] = "bfe72d0e07c1420e5e6c36a39c352a2f9c664e0910c58f9c977f08bc3a10c12d"

GEM_NAME = "unf_ext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
