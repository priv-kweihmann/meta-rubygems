# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rack"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developingweb applications in Ruby"
HOMEPAGE = "https://github.com/rack/rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=7a785c27e4c8649ea0fab2dfe7219d55"

DEPENDS_class-native += ""
RDEPENDS_${PN}_class-target += ""

SRC_URI[md5sum] = "e154f141c4463a817a088fd9bfa158e5"
SRC_URI[sha256sum] = "2638e7eb6689a5725c7e16f30cc4aa4e31694dc3ca30d790952526781bd0bb44"

GEM_NAME = "rack"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
