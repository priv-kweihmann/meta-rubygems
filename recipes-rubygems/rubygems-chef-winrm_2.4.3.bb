# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-winrm"
DESCRIPTION = "Ruby library for Windows Remote Management"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-builder-native \
    rubygems-chef-gyoku-native \
    rubygems-erubi-native \
    rubygems-gssapi-native \
    rubygems-httpclient-native \
    rubygems-logging-native \
    rubygems-nori-native \
    rubygems-rexml-native \
    rubygems-rubyntlm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "75ae900a24ed708e5b29b80e78d0740a"
SRC_URI[sha256sum] = "1a59dbf82b0ba91141ef460ba23739957f30b7e69ea073c0f1806058af05cbc9"

GEM_NAME = "chef-winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    mv ${D}${bindir}/rwinrm ${D}${bindir}/chef-rwinrm 
}

RDEPENDS:${PN}:class-target += "\
    rubygems-builder \
    rubygems-chef-gyoku \
    rubygems-erubi \
    rubygems-gssapi \
    rubygems-httpclient \
    rubygems-logging \
    rubygems-nori \
    rubygems-rexml \
    rubygems-rubyntlm \
"

BBCLASSEXTEND = "native"
