# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: diff-lcs"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using theMcIlroy-Hunt longest common subsequence (LCS) algorithm"
HOMEPAGE = "https://github.com/halostatue/diff-lcs"

LICENSE = "MIT & Artistic-2.0 & GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=c8c0239f05f28a44fb28e457f95e7890"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dc8ddfd9530b4c550310939fcac69702"
SRC_URI[sha256sum] = "708a5d52ec2945b50f8f53a181174aa1ef2c496edf81c05957fe956dabb363d5"

GEM_NAME = "diff-lcs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
