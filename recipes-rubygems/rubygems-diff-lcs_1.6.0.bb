# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: diff-lcs"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using theMcIlroy-Hunt longest common subsequence (LCS) algorithm"
HOMEPAGE = "https://github.com/halostatue/diff-lcs"

LICENSE = "MIT & Artistic-2.0 & GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=ea4648088e1ee6748049f22fe24901ea"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cc3317d675f7ef86daa4f3854c995ad1"
SRC_URI[sha256sum] = "a1e7f7b272962f8fc769358ad00001b87cdcf32ba349d6c70c6b544613d2da2e"

GEM_NAME = "diff-lcs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
