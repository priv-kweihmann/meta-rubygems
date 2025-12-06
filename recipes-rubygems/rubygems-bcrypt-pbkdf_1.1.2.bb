# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bcrypt_pbkdf"
DESCRIPTION = "This gem implements bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based PRF)"
HOMEPAGE = "https://github.com/net-ssh/bcrypt_pbkdf-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=65739eebd6bfa8bd39ca5a8cb1e21361"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a2af78f0f7a467c5764054e7950203fb"
SRC_URI[sha256sum] = "c2414c23ce66869b3eb9f643d6a3374d8322dfb5078125c82792304c10b94cf6"

GEM_NAME = "bcrypt_pbkdf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
