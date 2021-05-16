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

SRC_URI[md5sum] = "13acebd3800bdea503c24808f61a3847"
SRC_URI[sha256sum] = "d2f6425068347454936c75bf3b9fc0f925b40d17ba7df752031c8c083b195b40"

GEM_NAME = "listen"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-rb-fsevent \
    rubygems-rb-inotify \
"

BBCLASSEXTEND = "native"
