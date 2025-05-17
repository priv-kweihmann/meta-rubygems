# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: diff-lcs"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using theMcIlroy-Hunt longest common subsequence (LCS) algorithm"
HOMEPAGE = "https://github.com/halostatue/diff-lcs"

LICENSE = "MIT & Artistic-2.0 & GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=b5f73b7ae48836d15c9f53ed97aa505a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8b0a52653d73909ba22a84e21f93e116"
SRC_URI[sha256sum] = "9ae0d2cba7d4df3075fe8cd8602a8604993efc0dfa934cff568969efb1909962"

GEM_NAME = "diff-lcs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
