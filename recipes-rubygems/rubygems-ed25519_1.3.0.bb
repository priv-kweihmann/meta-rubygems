# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ed25519"
DESCRIPTION = "A Ruby binding to the Ed25519 elliptic curve public-key signature system described in RFC 8032."
HOMEPAGE = "https://github.com/RubyCrypto/ed25519"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a1aaaad387bcb19711f5e602aabee8e8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d810e3aa82d0a0fb9b9d7ca6146121e4"
SRC_URI[sha256sum] = "514a5584f84d39daac568a17ec93a4e7261e140c52c562ed8c382c18456e627d"

GEM_NAME = "ed25519"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
