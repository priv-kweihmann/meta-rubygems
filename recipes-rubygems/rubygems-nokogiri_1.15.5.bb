# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=18d72d0e0698337596b96caea3f93e0c"

EXTRA_DEPENDS:append = " \
    libxml2 \
    libxslt \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-mini-portile2-native \
    rubygems-racc-native \
"
DEPENDS:class-target += "\
    rubygems-mini-portile2 \
"

GEM_INSTALL_FLAGS:append = " \
    --use-system-libraries \
"

SRC_URI[md5sum] = "c08742ecd4aa3705b4ca0f1168d851ea"
SRC_URI[sha256sum] = "22448ca35dbcbdcec60dbe25ccf452b685a5436c28f21b2fec2e20917aba9100"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

INSANE_SKIP:${PN}-dev += "staticdev"

BBCLASSEXTEND = "native"
