# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=c644838b6b0e3a103049195adecd1ac6"

EXTRA_DEPENDS += "libxml2 libxslt"

DEPENDS_class-native += "libxml2-native \
                         libxslt-native \
                         rubygems-mini-portile2-native \
                         rubygems-racc-native"
DEPENDS_class-target += "rubygems-mini-portile2"
RDEPENDS_${PN}_class-target += "rubygems-mini-portile2 \
                                rubygems-racc"

GEM_INSTALL_FLAGS += "\
                      --use-system-libraries \
                      --with-xml2-lib=${STAGING_LIBDIR} \
                      --with-xml2-include=${STAGING_INCDIR} \
                      --with-xslt-lib=${STAGING_LIBDIR} \
                      --with-xslt-include=${STAGING_INCDIR} \
                      "

SRC_URI[md5sum] = "7d93e4cc0c24d1831ddf43ea6988f07f"
SRC_URI[sha256sum] = "42c2a54dd3ef03ef2543177bee3b5308313214e99f0d1aa85f984324329e5caa"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
