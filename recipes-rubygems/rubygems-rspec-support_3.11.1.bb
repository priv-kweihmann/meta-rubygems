# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-support"
DESCRIPTION = "Support utilities for RSpec gems"
HOMEPAGE = "https://github.com/rspec/rspec-support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e4c6d4a0edc4927fd19ea2608a4b5fe5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fa7e9b2a6502b2dc786c49eb444fc38a"
SRC_URI[sha256sum] = "f85f276a37e096b7bf6f308a96c59ba0a5398907f04942cede66cabc598c01b0"

GEM_NAME = "rspec-support"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
