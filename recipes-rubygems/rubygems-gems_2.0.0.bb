# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: gems"
DESCRIPTION = "Ruby wrapper for the RubyGems.org API"
HOMEPAGE = "https://github.com/rubygems/gems"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=842ca4a33be30d4a5d5ea377568b309b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b647c9d7be1d442b4d78ed1887b2d2b3"
SRC_URI[sha256sum] = "3ca986bd8c4e1aca49eef64b7f2aaa2642be86bd13579b27217105fdac7f543e"

GEM_NAME = "gems"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
