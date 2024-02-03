# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: diff-lcs"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using theMcIlroy-Hunt longest common subsequence (LCS) algorithm"
HOMEPAGE = "https://github.com/halostatue/diff-lcs"

LICENSE = "MIT & Artistic-2.0 & GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://License.md;md5=ea4648088e1ee6748049f22fe24901ea"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f4f1d50eed7496f7f32b09c9e81a5845"
SRC_URI[sha256sum] = "273223dfb40685548436d32b4733aa67351769c7dea621da7d9dd4813e63ddfe"

GEM_NAME = "diff-lcs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
