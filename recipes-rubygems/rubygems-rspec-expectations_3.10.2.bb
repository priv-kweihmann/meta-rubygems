# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-expectations"
DESCRIPTION = "rspec-expectations provides a simple, readable API to express expected outcomes of a code example."
HOMEPAGE = "https://github.com/rspec/rspec-expectations"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-diff-lcs-native \
    rubygems-rspec-support-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "94989657aec375012f00e8614571c623"
SRC_URI[sha256sum] = "fa9fdf7e7bf2e5e5b3143b2b18fea05e209406d96b92a9a722753426931432e3"

GEM_NAME = "rspec-expectations"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-diff-lcs \
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
