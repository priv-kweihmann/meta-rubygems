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

SRC_URI[md5sum] = "ed8fc34303a11b3378210b2e5bd47087"
SRC_URI[sha256sum] = "6c0dbc560a4aea8e058e3dc2633657725d9001d17ba01eb1582122a3ccfc2b50"

GEM_NAME = "rspec-expectations"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-diff-lcs \
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
