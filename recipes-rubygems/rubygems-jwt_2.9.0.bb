# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jwt"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) standard."
HOMEPAGE = "https://github.com/jwt/ruby-jwt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c5ddc412bf0298cd997114a6c994c5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "61b5f951986c9ec075fa5ae1964f3352"
SRC_URI[sha256sum] = "b12557826384128be2fad91ef4331ee4035f9a253cba8a3363a6a4ef7ae82acb"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
"

BBCLASSEXTEND = "native"
