# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

SRC_URI[md5sum] = "12bc2bf1143f41852cac03581652aaed"
SRC_URI[sha256sum] = "e5e217f035708dea1e9e83f0b4fec7dd0ce6e4d4e4bd59e31833d531281e2004"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
