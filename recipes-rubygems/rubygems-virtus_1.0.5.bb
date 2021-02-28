# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: virtus"
DESCRIPTION = "Attributes on Steroids for Plain Old Ruby Objects"
HOMEPAGE = "https://github.com/solnic/virtus"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e82a465aa1c29f8f04f81d00041f1cf"

DEPENDS_class-native += "\
    rubygems-axiom-types-native \
    rubygems-coercible-native \
    rubygems-descendants-tracker-native \
    rubygems-equalizer-native \
"

SRC_URI[md5sum] = "83051103a3439993d685a0c023b5f9f2"
SRC_URI[sha256sum] = "d3053b9ff62d3f8b7b233f7e1aa9530b73ed7e541bee2c62f2c711362287371a"

GEM_NAME = "virtus"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-axiom-types \
    rubygems-coercible \
    rubygems-descendants-tracker \
    rubygems-equalizer \
"

BBCLASSEXTEND = "native"
