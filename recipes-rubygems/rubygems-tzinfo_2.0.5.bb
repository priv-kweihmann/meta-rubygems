# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tzinfo"
DESCRIPTION = "TZInfo provides access to time zone data and allows times to be converted using time zone rules."
HOMEPAGE = "https://tzinfo.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a2bf1b5f566efe2cea2e616ce1c35fb4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "78ef42d61957291b66c4831d2673503d"
SRC_URI[sha256sum] = "c5352fd901544d396745d013f46a04ae2ed081ce806d942099825b7c2b09a167"

GEM_NAME = "tzinfo"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
