# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bcrypt_pbkdf"
DESCRIPTION = "This gem implements bcrypt_pbkdf (a variant of PBKDF2 with bcrypt-based PRF)"
HOMEPAGE = "https://github.com/net-ssh/bcrypt_pbkdf-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=65739eebd6bfa8bd39ca5a8cb1e21361"

SRC_URI[md5sum] = "778d710cbb4ce21e81b73385b9743d37"
SRC_URI[sha256sum] = "8590dfd5983e460dc981d40461fe1ace643e9f981e7be0a16170da1d95abaa59"

EXTRA_DEPENDS += "libxcrypt"

GEM_NAME = "bcrypt_pbkdf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
