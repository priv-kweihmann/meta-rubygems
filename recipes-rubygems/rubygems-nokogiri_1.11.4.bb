# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=2fcfc4989eb71e592d2e85d26d7fa91c"

EXTRA_DEPENDS += "\
    libxml2 \
    libxslt \
"

DEPENDS_class-native += "\
    rubygems-mini-portile2-native \
    rubygems-racc-native \
"
DEPENDS_class-target += "\
    rubygems-mini-portile2 \
"

GEM_INSTALL_FLAGS += "\
    --use-system-libraries \
"

SRC_URI[md5sum] = "26e4e5edaa30354c5468be7416051412"
SRC_URI[sha256sum] = "2bdd84d3bb168ab21a0e8d65f43194593f3b77b0016fa5de2dfaeac951fc2e17"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
