# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-core"
DESCRIPTION = "A minimal Train with a backends for ssh and winrm."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-addressable-native \
    rubygems-ffi-native \
    rubygems-json-native \
    rubygems-mixlib-shellout-native \
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
"

SRC_URI[md5sum] = "b7bfbf61ff38756ec9b6f4ca86bf9ffc"
SRC_URI[sha256sum] = "477f8fc8c5725d4a45b77d0df6680dcd064820c7171a5d05b3a05e4f906703eb"

GEM_NAME = "train-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-ffi \
    rubygems-json \
    rubygems-mixlib-shellout \
    rubygems-net-scp \
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
