# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=a32782de57df4ec5cfdb9739a122b62e"

EXTRA_DEPENDS:append = " \
    libxml2 \
    libxslt \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-mini-portile2-native \
    rubygems-racc-native \
"
DEPENDS:class-target += "\
    rubygems-mini-portile2 \
"

GEM_INSTALL_FLAGS:append = " \
    --use-system-libraries \
"

SRC_URI[md5sum] = "3e2b98a37dbfc6ce53fc03f1b965a274"
SRC_URI[sha256sum] = "6b9fc3b14fd0cedd21f6cad8cf565123ba7401e56b5d0aec180c23cdca28fd5a"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

INSANE_SKIP:${PN} += "rpaths"

INSANE_SKIP:${PN}-dev += "staticdev"

BBCLASSEXTEND = "native"
