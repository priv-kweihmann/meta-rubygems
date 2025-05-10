# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ed25519"
DESCRIPTION = "A Ruby binding to the Ed25519 elliptic curve public-key signature system described in RFC 8032."
HOMEPAGE = "https://github.com/RubyCrypto/ed25519"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61dd91b48281096c86a6afccc95767e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b21a935b51b4657022591d122e202e0a"
SRC_URI[sha256sum] = "16e97f5198689a154247169f3453ef4cfd3f7a47481fde0ae33206cdfdcac506"

GEM_NAME = "ed25519"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
