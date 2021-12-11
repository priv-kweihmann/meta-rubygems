# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-core"
DESCRIPTION = "A minimal Train with a backends for ssh and winrm."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-ffi-native \
    rubygems-json-native \
    rubygems-mixlib-shellout-native \
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "619b9f92510ea923ea80594ad9c55d09"
SRC_URI[sha256sum] = "a3f1effd2b16f35f1bf1c5a64b3d6735223093d2165122b7d1b5dd92fa9f5b8f"

GEM_NAME = "train-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-ffi \
    rubygems-json \
    rubygems-mixlib-shellout \
    rubygems-net-scp \
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
