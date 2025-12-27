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

SRC_URI[md5sum] = "837db6bb81159ea3209e2f8dc26eced5"
SRC_URI[sha256sum] = "d76c69065698ed1f85e717bd33d7942c38a50868f6b0673c636192b3d1b6054e"

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
