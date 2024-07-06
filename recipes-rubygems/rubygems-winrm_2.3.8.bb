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

SRC_URI[md5sum] = "000f25b1a1f4ef1d91af93e9b8a13c3b"
SRC_URI[sha256sum] = "91ac714017dde70677713356e2b9e7cc99498511885d3e0740d01799f0cd4ed0"

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
