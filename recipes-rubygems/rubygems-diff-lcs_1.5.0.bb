# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: diff-lcs"
DESCRIPTION = "Diff::LCS computes the difference between two Enumerable sequences using theMcIlroy-Hunt longest common subsequence (LCS) algorithm"
HOMEPAGE = "https://github.com/halostatue/diff-lcs"

LICENSE = "MIT & Artistic-2.0 & GPL-2.0+"
LIC_FILES_CHKSUM = "file://License.md;md5=debd9dff6792a920e1ca0ee909e1926a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7e80da0d376d61914f08f9ea9aedc46d"
SRC_URI[sha256sum] = "49b934001c8c6aedb37ba19daec5c634da27b318a7a3c654ae979d6ba1929b67"

GEM_NAME = "diff-lcs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
