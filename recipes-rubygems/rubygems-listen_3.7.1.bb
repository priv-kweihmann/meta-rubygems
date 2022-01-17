# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: listen"
DESCRIPTION = "The Listen gem listens to file modifications and notifies you about the changes"
HOMEPAGE = "https://github.com/guard/listen"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5cce4e14a2b69c74e9c91d66a93c7b65"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rb-fsevent-native \
    rubygems-rb-inotify-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "172fcb840e3559577adec802d5d6de76"
SRC_URI[sha256sum] = "3b80caa7aa77fae836916c2f9e3fbcafbd15f5d695dd487c1f5b5e7e465efe29"

GEM_NAME = "listen"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rb-fsevent \
    rubygems-rb-inotify \
"

BBCLASSEXTEND = "native"
