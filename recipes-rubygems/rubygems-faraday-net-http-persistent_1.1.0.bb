# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http_persistent"
DESCRIPTION = "Faraday adapter for NetHttpPersistent"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http_persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "ae97b1005af8471b25b27c87e361ded0"
SRC_URI[sha256sum] = "6a2654cac6311421a6d218aaf104bff333425768d025723b19fb1dcacb404c50"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
