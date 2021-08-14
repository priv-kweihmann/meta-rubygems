# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: nokogiri"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby"
HOMEPAGE = "https://nokogiri.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-DEPENDENCIES.md;md5=2cf22f72d34436ea00c7c5fa20cc9242"

EXTRA_DEPENDS += "\
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

SRC_URI[md5sum] = "beb25087df63ec77bcfb4bba001a54d6"
SRC_URI[sha256sum] = "d1975e30090ae723e05a6c9bd95fb795527e1a14d53a614735e2c3d8eef1e1e0"

GEM_NAME = "nokogiri"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mini-portile2 \
    rubygems-racc \
"

FILES:${PN}-staticdev += "${libdir}/ruby/gems/*/gems/*/ext/nokogiri/ports/*/libgumbo/*/lib/libgumbo.a"

BBCLASSEXTEND = "native"
