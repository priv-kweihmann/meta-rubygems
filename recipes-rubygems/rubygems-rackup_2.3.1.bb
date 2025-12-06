# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rackup"
DESCRIPTION = "A general server command for Rack applications."
HOMEPAGE = "https://github.com/rack/rackup"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=3c4a0ca1cc9b7163465653ca29b4a461"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rack-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b10243c55d8976cf35c547e9508ca9b6"
SRC_URI[sha256sum] = "6c79c26753778e90983761d677a48937ee3192b3ffef6bc963c0950f94688868"

GEM_NAME = "rackup"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rack \
"

BBCLASSEXTEND = "native"
