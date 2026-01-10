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

SRC_URI[md5sum] = "9b99dc0596fa8a620615c1658a3d47ac"
SRC_URI[sha256sum] = "3011db9f2323a7f02a5adde11a6aa1bdfa3039d4c5c2cdd82fde140a2b50c308"

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
