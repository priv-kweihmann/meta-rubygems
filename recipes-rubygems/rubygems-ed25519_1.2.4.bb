# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ed25519"
DESCRIPTION = "A Ruby binding to the Ed25519 elliptic curve public-key signature system described in RFC 8032."
HOMEPAGE = "https://github.com/crypto-rb/ed25519"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=502f191185091d3aaa852b107b27906c"

SRC_URI[md5sum] = "ba27e98736828152d900dd14b429fc27"
SRC_URI[sha256sum] = "dc62c3491e9484d566519ab2bfca1406c7527694c902e6d05074c3a33ecab3b8"

EXTRA_DEPENDS += "libxcrypt"

GEM_NAME = "ed25519"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
INSANE_SKIP_${PN} += "ldflags"
