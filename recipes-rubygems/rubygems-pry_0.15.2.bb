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

SRC_URI[md5sum] = "27a57c8cf410ed643a693b4b340a3afc"
SRC_URI[sha256sum] = "12d54b8640d3fa29c9211dd4ffb08f3fd8bf7a4fd9b5a73ce5b59c8709385b6b"

GEM_NAME = "pry"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-coderay \
    rubygems-method-source \
"

BBCLASSEXTEND = "native"
