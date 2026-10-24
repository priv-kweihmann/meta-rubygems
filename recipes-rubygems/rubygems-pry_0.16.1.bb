# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: pry"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerfulintrospection capabilities"
HOMEPAGE = "http://pry.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a8786285602b83b986e9d131169a298"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-coderay-native \
    rubygems-method-source-native \
    rubygems-reline-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f6b693adb5b46ab59c86e55ce9080ceb"
SRC_URI[sha256sum] = "d92d82c86e7f2dc34beec6d2892d5cf5ea517eea22eed3ceabb38ee62a98accc"

GEM_NAME = "pry"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-coderay \
    rubygems-method-source \
    rubygems-reline \
"

BBCLASSEXTEND = "native"
