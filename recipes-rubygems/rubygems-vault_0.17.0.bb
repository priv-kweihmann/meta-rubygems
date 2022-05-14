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

SRC_URI[md5sum] = "8698eb3ab3e3a3bffa26e4d4ba4f89c0"
SRC_URI[sha256sum] = "af4b8300fb39f6185ef2418ae45277b398fa6300fde2783e6a1cef7bdbc656a9"

GEM_NAME = "vault"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
