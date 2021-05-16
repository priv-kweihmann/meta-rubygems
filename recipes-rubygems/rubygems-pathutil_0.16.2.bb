# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: pathutil"
DESCRIPTION = "Like Pathname but a little less insane."
HOMEPAGE = "http://github.com/envygeeks/pathutil"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f940cffeb4fe06731c38f620cdcd7767"

DEPENDS_class-native += "\
    rubygems-forwardable-extended-native \
"

SRC_URI[md5sum] = "733b5e1d35c08b25b031c6bf2f31b273"
SRC_URI[sha256sum] = "e43b74365631cab4f6d5e4228f812927efc9cb2c71e62976edcb252ee948d589"

GEM_NAME = "pathutil"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-forwardable-extended \
"

BBCLASSEXTEND = "native"
