# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

SRC_URI[md5sum] = "56c164acf52d683b3176f84af0743fc7"
SRC_URI[sha256sum] = "498de9c170ab15573a69aca92cc6199122be319e108de0f74a41cb26abdceb18"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
