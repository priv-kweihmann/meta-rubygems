# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-support"
DESCRIPTION = "Support utilities for RSpec gems"
HOMEPAGE = "https://github.com/rspec/rspec-support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e4c6d4a0edc4927fd19ea2608a4b5fe5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6a743ced3c055e2664412574efa2b02e"
SRC_URI[sha256sum] = "03284a86b74afbbdeff6c3dc19ac2e0fe650453a96b89f860d459ca3e825d375"

GEM_NAME = "rspec-support"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
