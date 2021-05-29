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

SRC_URI[md5sum] = "217b9583ea9341ad72eccd8047a95cfc"
SRC_URI[sha256sum] = "9f182a07755dde5e1cda3777dce1d693723f4bef1b947947e0892e168d199dfc"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
