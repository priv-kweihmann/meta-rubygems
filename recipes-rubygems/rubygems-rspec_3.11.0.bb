# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec"
DESCRIPTION = "BDD for Ruby"
HOMEPAGE = "http://github.com/rspec"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d68fc2cfabf7ef564c5e9d537c8da05"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rspec-core-native \
    rubygems-rspec-expectations-native \
    rubygems-rspec-mocks-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cbde566e845f442b5bbd210057aebba0"
SRC_URI[sha256sum] = "8907f32e5c3095724e54c143e9cfc4df37079be349343dab9029becdb259bea5"

GEM_NAME = "rspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-core \
    rubygems-rspec-expectations \
    rubygems-rspec-mocks \
"

BBCLASSEXTEND = "native"
