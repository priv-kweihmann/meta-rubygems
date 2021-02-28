# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: gauntlet"
DESCRIPTION = "Gauntlet is a pluggable means of running code against all the latestgems and storing off the data."
HOMEPAGE = "https://github.com/seattlerb/gauntlet"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.txt;beginline=46;endline=69;md5=9729e7cc2f0b6cd88813876ac0335063"

DEPENDS_class-native += "\
    rubygems-net-http-persistent-native \
"

SRC_URI[md5sum] = "17e5c5c9cf8fd39b0bb171e070f091d6"
SRC_URI[sha256sum] = "f4e78297c81a7f0b242d169615a7a869f7e8cb2ac28d638b31ae7c9ef49522eb"

GEM_NAME = "gauntlet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-net-http-persistent \
"

BBCLASSEXTEND = "native"
