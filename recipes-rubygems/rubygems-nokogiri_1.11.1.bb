# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=c644838b6b0e3a103049195adecd1ac6"


GEM_INSTALL_FLAGS += "--use-system-libraries"

DEPENDS_class-native += "libxml2-native libxslt-native rubygems-mini-portile2-native"
DEPENDS_class-target += "libxml2 libxslt rubygems-mini-portile2"
RDEPENDS_${PN}_class-target += "rubygems-mini-portile2"

SRC_URI[md5sum] = "7d93e4cc0c24d1831ddf43ea6988f07f"
SRC_URI[sha256sum] = "42c2a54dd3ef03ef2543177bee3b5308313214e99f0d1aa85f984324329e5caa"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
