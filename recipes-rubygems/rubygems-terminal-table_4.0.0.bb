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

SRC_URI[md5sum] = "2efdc895367357d1961655f667fb2100"
SRC_URI[sha256sum] = "f504793203f8251b2ea7c7068333053f0beeea26093ec9962e62ea79f94301d2"

GEM_NAME = "terminal-table"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-display-width \
"

BBCLASSEXTEND = "native"
