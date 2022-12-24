# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jwt"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) standard."
HOMEPAGE = "https://github.com/jwt/ruby-jwt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c5ddc412bf0298cd997114a6c994c5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "de114aacddca31d037a928a38bde370b"
SRC_URI[sha256sum] = "68a3c88cfc248f74ab8bd384eb3e9fb81893819d4087610eeccfda2b54b81ff5"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
