# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov-html"
DESCRIPTION = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov-html"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23973b4bd84f8a5e081dd23bb739394d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d539a79033d7a290d5e3ff3ac77dc2a4"
SRC_URI[sha256sum] = "bd0b8e54e7c2d7685927e8d6286466359b6f16b18cb0df47b508e8d73c777246"

GEM_NAME = "simplecov-html"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
