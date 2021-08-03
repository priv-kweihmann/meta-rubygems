# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: virtus"
DESCRIPTION = "Attributes on Steroids for Plain Old Ruby Objects"
HOMEPAGE = "https://github.com/solnic/virtus"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e82a465aa1c29f8f04f81d00041f1cf"

DEPENDS:class-native += "\
    rubygems-axiom-types-native \
    rubygems-coercible-native \
    rubygems-descendants-tracker-native \
"

SRC_URI[md5sum] = "9a3cd6a019c80c3465ce783ea9091cf5"
SRC_URI[sha256sum] = "8841dae4eb7fcc097320ba5ea516bf1839e5d056c61ee27138aa4bddd6e3d1c2"

GEM_NAME = "virtus"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-axiom-types \
    rubygems-coercible \
    rubygems-descendants-tracker \
"

BBCLASSEXTEND = "native"
