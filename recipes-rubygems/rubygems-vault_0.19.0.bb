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
    rubygems-base64-native \
    rubygems-connection-pool-native \
    rubygems-net-http-persistent-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a58758184f977c2490da9a37574c4290"
SRC_URI[sha256sum] = "a18f91119e1296120d6957e47583f42d1636c9a5c7607780cf604b9f9e1b28aa"

GEM_NAME = "vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sigv4 \
    rubygems-base64 \
    rubygems-connection-pool \
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
