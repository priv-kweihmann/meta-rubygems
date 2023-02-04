# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jwt"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) standard."
HOMEPAGE = "https://github.com/jwt/ruby-jwt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c5ddc412bf0298cd997114a6c994c5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cf1ad4830061435fd070e58183b947fe"
SRC_URI[sha256sum] = "b7e0b8669170abfe90cae8b6534d3d05d60fa3f785f0f005e44a41abcb1fd227"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
