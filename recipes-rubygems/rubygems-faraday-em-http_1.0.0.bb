# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-em_http"
DESCRIPTION = "Faraday adapter for Em::Http"
HOMEPAGE = "https://github.com/lostisland/faraday-em_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "4b14f4a6132802f235f79e8ab987e3c2"
SRC_URI[sha256sum] = "7a3d4c7079789121054f57e08cd4ef7e40ad1549b63101f38c7093a9d6c59689"

GEM_NAME = "faraday-em_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
