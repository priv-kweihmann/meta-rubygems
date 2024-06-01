# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: progress_bar"
DESCRIPTION = "Give people feedback about long-running tasks without overloading them with information: Use a progress bar, like Curl or Wget!"
HOMEPAGE = "http://github.com/paul/progress_bar"

LICENSE = "WTFPL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c79afcc5a5e0f48a4a5a5687a026b3e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-highline-native \
    rubygems-options-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "433494ba41dcba869dacc01ec4dca34e"
SRC_URI[sha256sum] = "adb10e040275e08eadfbe405749584e4b01fd15e8e692fdcb4b1969e9c071c8c"

GEM_NAME = "progress_bar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-highline \
    rubygems-options \
"

BBCLASSEXTEND = "native"
