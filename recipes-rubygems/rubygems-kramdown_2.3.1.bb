# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: kramdown"
DESCRIPTION = "kramdown is yet-another-markdown-parser but fast, pure Ruby,using a strict syntax definition and supporting several common extensions."
HOMEPAGE = "http://kramdown.gettalong.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=efa42ef946dcb15e4ee38ea3aeedf2b0"

DEPENDS:class-native += "\
    rubygems-rexml-native \
"

SRC_URI[md5sum] = "1324f4af5b0b15d96066d2654fbe7d15"
SRC_URI[sha256sum] = "59e938cfa42a3d6169b295727fe09c4c91d742336c8fbd1042529f4db664ab49"

GEM_NAME = "kramdown"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
