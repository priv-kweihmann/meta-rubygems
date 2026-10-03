# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: listen"
DESCRIPTION = "The Listen gem listens to file modifications and notifies you about the changes"
HOMEPAGE = "https://github.com/guard/listen"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5cce4e14a2b69c74e9c91d66a93c7b65"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
    rubygems-rb-fsevent-native \
    rubygems-rb-inotify-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b8ced4747aa9cd5b919e8a2b5ef58fbf"
SRC_URI[sha256sum] = "4c3f32855657f348747da4dd2372ff3790d90a6b1d3e4f21a3706adb2d04783c"

GEM_NAME = "listen"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-rb-fsevent \
    rubygems-rb-inotify \
"

BBCLASSEXTEND = "native"
