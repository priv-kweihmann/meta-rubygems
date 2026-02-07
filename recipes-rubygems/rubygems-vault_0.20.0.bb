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

SRC_URI[md5sum] = "e575960678ce7938c6eae44b0bad0cec"
SRC_URI[sha256sum] = "7c20581cdcc150ecacfee88d235aef67e8e54ac5404d322976294a00de69cc73"

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
