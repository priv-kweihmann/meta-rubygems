# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-patron"
DESCRIPTION = "Faraday adapter for Patron"
HOMEPAGE = "https://github.com/lostisland/faraday-patron"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

SRC_URI[md5sum] = "918c3b3a432993441e083c1f37715c8d"
SRC_URI[sha256sum] = "dc2cd7b340bb3cc8e36bcb9e6e7eff43d134b6d526d5f3429c7a7680ddd38fa7"

GEM_NAME = "faraday-patron"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
