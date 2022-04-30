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

SRC_URI[md5sum] = "7421608eb9a387500910c92f445afc4c"
SRC_URI[sha256sum] = "b62e5bcbd6ea20c7a6730ebbb2a107237856e14f29cebf5b10c876cc1a2481c5"

GEM_NAME = "kramdown"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
