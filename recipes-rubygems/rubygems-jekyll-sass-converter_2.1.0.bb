# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jekyll-sass-converter"
DESCRIPTION = "A basic Sass converter for Jekyll."
HOMEPAGE = "https://github.com/jekyll/jekyll-sass-converter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS_class-native += "\
    rubygems-sassc-native \
"

SRC_URI[md5sum] = "8a55ea7e8984f861d9bcdf38b8f43ff8"
SRC_URI[sha256sum] = "bb25965bfdec2c61220192f45d9358d34a9fce388f72ec95119fc6cc09c9cc12"

GEM_NAME = "jekyll-sass-converter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-sassc \
"

BBCLASSEXTEND = "native"
