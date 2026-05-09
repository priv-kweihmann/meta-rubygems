# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=71270ccd875404f52a71e65c18eb9f88"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e2226067da4a899ec7e19441f57a5902"
SRC_URI[sha256sum] = "a372fc67892a4f8c0bc8ec906b720353d8e48807a64b2e63adf99b1e3583a034"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
