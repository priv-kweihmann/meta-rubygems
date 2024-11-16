# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: pry"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerfulintrospection capabilities"
HOMEPAGE = "http://pry.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36c4b1806b2aadea5cbee4bbbdeb341c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-coderay-native \
    rubygems-method-source-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b7ae6ea6303a4f9056a3abb2f08e8d51"
SRC_URI[sha256sum] = "91e7925ea58c88e671b058a3a939bb529016de5ec57084b000057b2a1fec1930"

GEM_NAME = "pry"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-coderay \
    rubygems-method-source \
"

BBCLASSEXTEND = "native"
