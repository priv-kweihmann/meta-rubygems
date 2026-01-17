# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-winrm"
DESCRIPTION = "Ruby library for Windows Remote Management"
HOMEPAGE = "https://github.com/WinRb/WinRM"

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

SRC_URI[md5sum] = "bd84dcfe35de083ad377908af3205c31"
SRC_URI[sha256sum] = "d0214fc72e39d7830e8bdc28d0efb12e1ef55bd1cd547ae4bf2e509d298b85f3"

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
