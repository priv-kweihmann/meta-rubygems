# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http_persistent"
DESCRIPTION = "Faraday adapter for NetHttpPersistent"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http_persistent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "e13bafd2297cbf703e0385e142c9ce62"
SRC_URI[sha256sum] = "0b0cbc8f03dab943c3e1cc58d8b7beb142d9df068b39c718cd83e39260348335"

GEM_NAME = "faraday-net_http_persistent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
