# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: winrm"
DESCRIPTION = "Ruby library for Windows Remote Management"
HOMEPAGE = "https://github.com/WinRb/WinRM"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-builder-native \
    rubygems-erubi-native \
    rubygems-gssapi-native \
    rubygems-gyoku-native \
    rubygems-httpclient-native \
    rubygems-logging-native \
    rubygems-nori-native \
    rubygems-rexml-native \
    rubygems-rubyntlm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3ee81372528048b8305334ab6f36b4e9"
SRC_URI[sha256sum] = "ef6b767c5772d06e186300b506ea5e65afb849904a551f8482a5cfc2a1be5d06"

GEM_NAME = "winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-builder \
    rubygems-erubi \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-httpclient \
    rubygems-logging \
    rubygems-nori \
    rubygems-rexml \
    rubygems-rubyntlm \
"

BBCLASSEXTEND = "native"
