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

SRC_URI[md5sum] = "6be2817bed1e9ea1e6c23906319e1d1c"
SRC_URI[sha256sum] = "c4fe54efedaca1d351280b45b8849af363184696fcac1c72e0415f9bdac4334d"

GEM_NAME = "pry"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-coderay \
    rubygems-method-source \
"

BBCLASSEXTEND = "native"
