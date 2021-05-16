# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: safe_yaml"
DESCRIPTION = "Parse YAML safely"
HOMEPAGE = "https://github.com/dtao/safe_yaml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=87342e90f6d5e1c4c246b64ec59c982b"

SRC_URI[md5sum] = "23b7ec89ee8b27f77164ae7867177eb8"
SRC_URI[sha256sum] = "a6ac2d64b7eb027bdeeca1851fe7e7af0d668e133e8a88066a0c6f7087d9f848"

GEM_NAME = "safe_yaml"

EXTRA_RDEPENDS += "bash"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
