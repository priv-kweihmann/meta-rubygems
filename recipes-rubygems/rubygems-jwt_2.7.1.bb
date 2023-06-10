# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jwt"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) standard."
HOMEPAGE = "https://github.com/jwt/ruby-jwt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c5ddc412bf0298cd997114a6c994c5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d3a7ba14444b03f91c7d36b61519fe17"
SRC_URI[sha256sum] = "07357cd2f180739b2f8184eda969e252d850ac996ed0a23f616e8ff0a90ae19b"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
