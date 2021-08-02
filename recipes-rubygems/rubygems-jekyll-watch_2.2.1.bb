# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jekyll-watch"
DESCRIPTION = "Rebuild your Jekyll site when a file changes with the `--watch` switch."
HOMEPAGE = "https://github.com/jekyll/jekyll-watch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS:class-native += "\
    rubygems-listen-native \
"

SRC_URI[md5sum] = "db6ffa7da229622f10fdc17bae627515"
SRC_URI[sha256sum] = "bc44ed43f5e0a552836245a54dbff3ea7421ecc2856707e8a1ee203a8387a7e1"

GEM_NAME = "jekyll-watch"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-listen \
"

BBCLASSEXTEND = "native"
