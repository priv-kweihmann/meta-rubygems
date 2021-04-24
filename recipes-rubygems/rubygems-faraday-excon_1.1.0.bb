# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-excon"
DESCRIPTION = "Faraday adapter for Excon"
HOMEPAGE = "https://github.com/lostisland/faraday-excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "91d075ce12868a30a520af0588930927"
SRC_URI[sha256sum] = "b055c842376734d7f74350fe8611542ae2000c5387348d9ba9708109d6e40940"

GEM_NAME = "faraday-excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
