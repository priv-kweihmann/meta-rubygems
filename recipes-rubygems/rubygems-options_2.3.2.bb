# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: options"
DESCRIPTION = "parse options from *args cleanly"
HOMEPAGE = "https://github.com/ahoward/options"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://TODO;md5=abcdef"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bda39dc56a42378d9f10ef0ba27ce2a9"
SRC_URI[sha256sum] = "32413a4b9e363234eed2eecfb2a1a9deb32810f72c54820a37a62f65b905c5e8"

GEM_NAME = "options"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
