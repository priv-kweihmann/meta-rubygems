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

DEPENDS:class-native += "\
    rubygems-mini-portile2-native \
    rubygems-racc-native \
"
DEPENDS:class-target += "\
    rubygems-mini-portile2 \
"

GEM_INSTALL_FLAGS += "\
    --use-system-libraries \
"

SRC_URI[md5sum] = "c49903a564d6f71765a04afc9c7ff974"
SRC_URI[sha256sum] = "4976a9c9e796527d51dc6c311b9bd93a0233f6a7962a0f569aa5c782461836ef"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
