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

SRC_URI[md5sum] = "6cb37c0fd07d07156d89739a7c7a4b23"
SRC_URI[sha256sum] = "8240002e6f9a68fd5b9a05ed5cc1493ac90bfdcfd8ff10faa3831f67f7fb60ad"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
"

BBCLASSEXTEND = "native"
