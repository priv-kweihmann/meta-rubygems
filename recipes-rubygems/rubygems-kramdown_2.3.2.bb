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

SRC_URI[md5sum] = "99ee9255319afa646e8f81def9234db4"
SRC_URI[sha256sum] = "cb4530c2e9d16481591df2c9336723683c354e5416a5dd3e447fa48215a6a71c"

GEM_NAME = "kramdown"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
