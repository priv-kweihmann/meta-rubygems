# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jekyll-sass-converter"
DESCRIPTION = "A basic Sass converter for Jekyll."
HOMEPAGE = "https://github.com/jekyll/jekyll-sass-converter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-sassc-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "858a8135d589d93bd5c8fc626fea7c81"
SRC_URI[sha256sum] = "71894f61b1f062f9d56e90b83b29386c85af349749c5d6277a5ba4b2e69cfd1c"

GEM_NAME = "jekyll-sass-converter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-sassc \
"

BBCLASSEXTEND = "native"
