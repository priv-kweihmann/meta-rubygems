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

SRC_URI[md5sum] = "7b4bf66449ddc96a47608c978196841f"
SRC_URI[sha256sum] = "1ba542204c66b6f9111ff00dcc26075b95b220b07f2905d8261740c82f7f02fa"

GEM_NAME = "kramdown"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
