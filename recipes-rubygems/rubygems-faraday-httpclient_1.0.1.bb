# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-httpclient"
DESCRIPTION = "Faraday adapter for HTTPClient"
HOMEPAGE = "https://github.com/lostisland/faraday-httpclient"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "97c44d6016b1db347252b54a57f3e424"
SRC_URI[sha256sum] = "4c8ff1f0973ff835be8d043ef16aaf54f47f25b7578f6d916deee8399a04d33b"

GEM_NAME = "faraday-httpclient"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
