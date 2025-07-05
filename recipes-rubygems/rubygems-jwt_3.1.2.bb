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

SRC_URI[md5sum] = "771f12b0d84999332ce0f22aefd00ab2"
SRC_URI[sha256sum] = "af6991f19a6bb4060d618d9add7a66f0eeb005ac0bc017cd01f63b42e122d535"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
"

BBCLASSEXTEND = "native"
