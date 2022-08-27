# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jwt"
DESCRIPTION = "A pure ruby implementation of the RFC 7519 OAuth JSON Web Token (JWT) standard."
HOMEPAGE = "https://github.com/jwt/ruby-jwt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7c5ddc412bf0298cd997114a6c994c5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f4793c935bd1fe14234a9585095f64e9"
SRC_URI[sha256sum] = "b835fe55287572e1f65128d6c12d3ff7402bb4652c4565bf3ecdcb974db7954d"

GEM_NAME = "jwt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
