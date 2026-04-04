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
    rubygems-net-http-persistent-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "27b119acda83c6d52a1d872856ef6f2b"
SRC_URI[sha256sum] = "169cede8b9ea5f21c975ea92f7618c0d777d9d983afc06f2ddd39b3dd571d660"

GEM_NAME = "vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sigv4 \
    rubygems-base64 \
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
