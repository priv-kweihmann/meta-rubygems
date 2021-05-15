# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

SRC_URI[md5sum] = "a5b97ab00624c4d1272293d50af1f734"
SRC_URI[sha256sum] = "32a396ad5e092f6a7b36122976570ac778fbe04f19be2a0dc683ac7189d4c626"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
