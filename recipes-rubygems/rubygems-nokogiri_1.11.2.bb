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

SRC_URI[md5sum] = "955194f26984cacc9b9a74916f01ef6f"
SRC_URI[sha256sum] = "175c9ce431d2719cc4c5c4146372f8d84066013f216e560e98aa29ee906ba12c"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
