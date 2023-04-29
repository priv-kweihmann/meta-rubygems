# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parser"
DESCRIPTION = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ast-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "67cb5067f79ad631b43e16528dbf394b"
SRC_URI[sha256sum] = "1d6542b6d3c5e15bedb500fa68eb937aa0eaae644eb0eda43e9a1fa9b54dc821"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
