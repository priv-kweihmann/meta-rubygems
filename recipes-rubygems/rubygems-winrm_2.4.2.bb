# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: winrm"
DESCRIPTION = "Ruby library for Windows Remote Management"
HOMEPAGE = "https://github.com/WinRb/WinRM"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-builder-native \
    rubygems-gssapi-native \
    rubygems-gyoku-native \
    rubygems-httpclient-native \
    rubygems-logger-native \
    rubygems-nori-native \
    rubygems-rexml-native \
    rubygems-rubyntlm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a168657bd312d1fb78ece68f76a7a832"
SRC_URI[sha256sum] = "1dd3377cb9e414097b23718af5640b0bff726889f6cce2542985417c1c78abca"

GEM_NAME = "winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-builder \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-httpclient \
    rubygems-logger \
    rubygems-nori \
    rubygems-rexml \
    rubygems-rubyntlm \
"

BBCLASSEXTEND = "native"
