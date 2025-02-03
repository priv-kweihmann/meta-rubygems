# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: xmldsig"
DESCRIPTION = "This gem is a (partial) implementation of the XMLDsig specification"
HOMEPAGE = "https://github.com/benoist/xmldsig"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89e04fc79764acf1bd5023faecc03b42"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-nokogiri-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ad09526516552aae1f999a857a06adb6"
SRC_URI[sha256sum] = "8e004ddb8fec987ca839ff5d2e210e06aa3b7689f8a3dc2610a57c1057facbdf"

GEM_NAME = "xmldsig"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-nokogiri \
"

BBCLASSEXTEND = "native"
