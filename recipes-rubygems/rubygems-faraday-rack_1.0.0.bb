# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-rack"
DESCRIPTION = "Faraday adapter for Rack"
HOMEPAGE = "https://github.com/lostisland/faraday-rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "e1f15e1a8e72e3d38c7973550e11925e"
SRC_URI[sha256sum] = "ef60ec969a2bb95b8dbf24400155aee64a00fc8ba6c6a4d3968562bcc92328c0"

GEM_NAME = "faraday-rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
