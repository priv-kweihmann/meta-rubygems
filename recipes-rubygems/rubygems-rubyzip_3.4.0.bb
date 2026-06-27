# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=71270ccd875404f52a71e65c18eb9f88"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2c848dbdba2380748f87867a50e8278e"
SRC_URI[sha256sum] = "6de39bc9eba302b635a476d16c9e16b0872ad24517c2f98f2b3a7ea23caff57b"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
