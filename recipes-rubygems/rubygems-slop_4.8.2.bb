# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

SRC_URI[md5sum] = "f6d6720a1fef617e77ae2feab9e71456"
SRC_URI[sha256sum] = "a3d5be3ad304b9dbd00b7c18a0a067b09ff6fd28485d4c6b05adb294d1eea115"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
