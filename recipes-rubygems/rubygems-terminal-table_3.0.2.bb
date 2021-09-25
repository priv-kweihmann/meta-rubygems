# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: terminal-table"
DESCRIPTION = "Simple, feature rich ascii table generation library"
HOMEPAGE = "https://github.com/tj/terminal-table"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1be7620aed40ef7f9125c19d23513d14"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-unicode-display-width-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3916a3147871d6421688e575d5939e12"
SRC_URI[sha256sum] = "f951b6af5f3e00203fb290a669e0a85c5dd5b051b3b023392ccfd67ba5abae91"

GEM_NAME = "terminal-table"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-display-width \
"

BBCLASSEXTEND = "native"
