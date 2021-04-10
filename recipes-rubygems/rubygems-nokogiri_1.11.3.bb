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

SRC_URI[md5sum] = "5daafd86dd2c292005170da77a9708e6"
SRC_URI[sha256sum] = "a09beb5c1fa55da31ee494da8c6ad34b2636d099d6c04b964c7f51f15a45a7a5"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
