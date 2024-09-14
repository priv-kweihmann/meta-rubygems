# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov-html"
DESCRIPTION = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov-html"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23973b4bd84f8a5e081dd23bb739394d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9dfe06e945a254dae1d3fff7da03e1dc"
SRC_URI[sha256sum] = "5dab0b7ee612e60e9887ad57693832fdf4695b4c0c859eaea5f95c18791ef10b"

GEM_NAME = "simplecov-html"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
