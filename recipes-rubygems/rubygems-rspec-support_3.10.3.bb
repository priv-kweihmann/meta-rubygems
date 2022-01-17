# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-support"
DESCRIPTION = "Support utilities for RSpec gems"
HOMEPAGE = "https://github.com/rspec/rspec-support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e4c6d4a0edc4927fd19ea2608a4b5fe5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a9ee7a3ae301167f9aba031cd0dc463b"
SRC_URI[sha256sum] = "65c88f8cbe579461f411097682e6402960eae327eef08e86ef581b8c609e4c5e"

GEM_NAME = "rspec-support"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
