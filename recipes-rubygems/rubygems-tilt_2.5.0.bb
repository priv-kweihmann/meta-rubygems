# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "https://github.com/jeremyevans/tilt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=6070b204e482206d791ae800b4093464"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4066234135c214d47424c78e1b3fbc22"
SRC_URI[sha256sum] = "3c871a9ffb0fd8191944d8bbd776a371ba1eeb683483cecf1b2572b292293b15"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
