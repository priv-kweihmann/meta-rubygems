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

SRC_URI[md5sum] = "3ab0778dee499831dbdf1a1d052c586b"
SRC_URI[sha256sum] = "a3c0859805bdfd88bef90bf050cbb4a04f01fe9e0ad24e5b77571e1abd823100"

GEM_NAME = "rspec-expectations"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-diff-lcs \
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
