# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: terminal-table"
DESCRIPTION = "Simple, feature rich ascii table generation library"
HOMEPAGE = "https://github.com/tj/terminal-table"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1be7620aed40ef7f9125c19d23513d14"

DEPENDS_class-native += "\
    rubygems-unicode-display-width-native \
"

SRC_URI[md5sum] = "b56c424f919daf3474dc5f57f31f7bef"
SRC_URI[sha256sum] = "9273aff0bfab536c05fdf2e301b760326d3b8c4575ada987843a82828eaecb7c"

GEM_NAME = "terminal-table"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-unicode-display-width \
"

BBCLASSEXTEND = "native"
