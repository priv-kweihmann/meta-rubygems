# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: vault"
DESCRIPTION = "Vault is a Ruby API client for interacting with a Vault server."
HOMEPAGE = "https://github.com/hashicorp/vault-ruby"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0bb1c8b775679ba99b2ccbbf7aed898d"
SRC_URI[sha256sum] = "51ba5c3bd50d1d6faf245d5e5fcf13d6387c5e3afcd27ab96376bc2b9e55fb10"

GEM_NAME = "vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
