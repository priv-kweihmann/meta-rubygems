# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=a32782de57df4ec5cfdb9739a122b62e"

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

SRC_URI[md5sum] = "e51abeaf670376180a696fbde4e1b650"
SRC_URI[sha256sum] = "d5cc0731008aa3b3a87b361203ea3d19b2069628cb55e46ac7d84a0445e69cc1"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

INSANE_SKIP:${PN} += "rpaths"

INSANE_SKIP:${PN}-dev += "staticdev"

BBCLASSEXTEND = "native"
