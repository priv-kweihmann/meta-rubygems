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

SRC_URI[md5sum] = "2c3988a6d3793cafbc4a5daa1e58a65f"
SRC_URI[sha256sum] = "7f6a54f2a36a6d4c1d426a7a0a350ca02e3056a8207e0e2dce9c1ad7796cade9"

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
