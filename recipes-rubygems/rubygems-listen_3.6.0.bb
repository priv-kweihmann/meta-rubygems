# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: listen"
DESCRIPTION = "The Listen gem listens to file modifications and notifies you about the changes"
HOMEPAGE = "https://github.com/guard/listen"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5cce4e14a2b69c74e9c91d66a93c7b65"

DEPENDS_class-native += "\
    rubygems-rb-fsevent-native \
    rubygems-rb-inotify-native \
"

SRC_URI[md5sum] = "263bd6742583d73d1628d77914193e6c"
SRC_URI[sha256sum] = "f095d31f66f8cef7142d0658697961900f3ee3d3223980a3bc8ca9a449f307b7"

GEM_NAME = "listen"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-rb-fsevent \
    rubygems-rb-inotify \
"

BBCLASSEXTEND = "native"
