# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: representable"
DESCRIPTION = "Renders and parses JSON/XML/YAML documents from and to Ruby objects"
HOMEPAGE = "https://github.com/trailblazer/representable/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcd09664f3623a57e87230c043531dc6"

DEPENDS_class-native += "\
    rubygems-declarative-native \
    rubygems-declarative-option-native \
    rubygems-uber-native \
"

SRC_URI[md5sum] = "a856f24fc0d0d038fafee7e5406ca690"
SRC_URI[sha256sum] = "07d43917dea4712ecebd19c1909e769deed863ad444d23ceb6461519e2cba962"

GEM_NAME = "representable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-declarative \
    rubygems-declarative-option \
    rubygems-uber \
"

BBCLASSEXTEND = "native"
