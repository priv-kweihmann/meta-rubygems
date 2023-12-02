# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: vault"
DESCRIPTION = "Vault is a Ruby API client for interacting with a Vault server."
HOMEPAGE = "https://github.com/hashicorp/vault-ruby"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5f602096588f722bbcddc67e81d4415"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "05bf04c3f3f588ed764b7c42656cd1e0"
SRC_URI[sha256sum] = "29346c2d8364c19effb548b7a8952bf187545b99b70d1ddde76bd6c69046d27c"

GEM_NAME = "vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
