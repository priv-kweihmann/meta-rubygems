# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bcrypt_pbkdf"
DESCRIPTION = "This gem implements bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based PRF)"
HOMEPAGE = "https://github.com/net-ssh/bcrypt_pbkdf-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=65739eebd6bfa8bd39ca5a8cb1e21361"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3efcbfd0289e0783513b738823a2deba"
SRC_URI[sha256sum] = "2f9077dde837d1f0dd2eb0f9e5327c6871c68ebc8eba88870fb6b7956e1e2b13"

GEM_NAME = "bcrypt_pbkdf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
