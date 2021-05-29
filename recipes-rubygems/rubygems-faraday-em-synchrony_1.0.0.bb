# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-em_synchrony"
DESCRIPTION = "Faraday adapter for EM::Synchrony"
HOMEPAGE = "https://github.com/lostisland/faraday-em_synchrony"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "95c919f72c9c13de42cdd19c4caebcc5"
SRC_URI[sha256sum] = "460dad1c30cc692d6e77d4c391ccadb4eca4854b315632cd7e560f74275cf9ed"

GEM_NAME = "faraday-em_synchrony"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
