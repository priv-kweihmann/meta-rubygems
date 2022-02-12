# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-mocks"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking"
HOMEPAGE = "https://github.com/rspec/rspec-mocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-diff-lcs-native \
    rubygems-rspec-support-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "11bc8a74175d3aa9bf9bc5625885d5bb"
SRC_URI[sha256sum] = "43fbe2a3cdb8cb894d52440392baca61aa0e043b640e3f8963ce426f0c6b6878"

GEM_NAME = "rspec-mocks"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-diff-lcs \
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
