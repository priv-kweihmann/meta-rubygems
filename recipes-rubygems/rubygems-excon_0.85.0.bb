# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

SRC_URI[md5sum] = "f23826d2b87acfddc85e1b794d133169"
SRC_URI[sha256sum] = "ea0c472e3231eed9d851c3dd8b4cacab66f8fe096ab4f86036a235230577d3c7"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
