# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

SRC_URI[md5sum] = "733ac13884bfa67f9b87047aeb35e9d9"
SRC_URI[sha256sum] = "746959de8a506ad5ebc4318d2ea6e0c4b6674fa915d64284e20371be84cadaa0"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
