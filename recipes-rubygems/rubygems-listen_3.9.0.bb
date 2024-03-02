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

SRC_URI[md5sum] = "e90774da3cf46d2c69ab3f39249b45fe"
SRC_URI[sha256sum] = "db9e4424e0e5834480385197c139cb6b0ae0ef28cc13310cfd1ca78377d59c67"

GEM_NAME = "listen"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rb-fsevent \
    rubygems-rb-inotify \
"

BBCLASSEXTEND = "native"
