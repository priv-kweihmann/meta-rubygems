# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: kramdown"
DESCRIPTION = "kramdown is yet-another-markdown-parser but fast, pure Ruby,using a strict syntax definition and supporting several common extensions."
HOMEPAGE = "http://kramdown.gettalong.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=efa42ef946dcb15e4ee38ea3aeedf2b0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "54bbfd91ea474078933f6cfdd7c0f7ff"
SRC_URI[sha256sum] = "87bbb6abd9d3cebe4fc1f33e367c392b4500e6f8fa19dd61c0972cf4afe7368c"

GEM_NAME = "kramdown"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
