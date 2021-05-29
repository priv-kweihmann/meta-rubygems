# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simplistic port-like solution for developers"
HOMEPAGE = "https://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

DEPENDS_class-native += "\
    rubygems-net-ftp-native \
"

SRC_URI[md5sum] = "4a8698f0afe695c9a1b7050513710b3f"
SRC_URI[sha256sum] = "7ac4d87aeab13575ac09813e1f87f03f330f2c9e357a11e6f291a95127015e28"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-net-ftp \
"

BBCLASSEXTEND = "native"
