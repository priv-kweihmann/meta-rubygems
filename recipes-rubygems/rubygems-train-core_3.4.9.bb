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
RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-ffi \
    rubygems-json \
    rubygems-mixlib-shellout \
    rubygems-net-scp \
    rubygems-net-ssh \
"

SRC_URI[md5sum] = "e1c885d2cc85a509cd84a2ec3e2016ae"
SRC_URI[sha256sum] = "d7ad8fa9a379c43a30baaaf1141af1cb28349d386c054f7fc81d169a625d6edd"

GEM_NAME = "train-core"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
