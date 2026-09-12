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
    rubygems-erubi-native \
    rubygems-gssapi-native \
    rubygems-gyoku-native \
    rubygems-httpclient-native \
    rubygems-logger-native \
    rubygems-nori-native \
    rubygems-rexml-native \
    rubygems-rubyntlm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e30c12b61cd368349be834947bd15c69"
SRC_URI[sha256sum] = "9e210758f5c4d76cbc28ff0b27c082483c91c17dcb6cd44ce3467c08160aa916"

GEM_NAME = "winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-builder \
    rubygems-erubi \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-httpclient \
    rubygems-logger \
    rubygems-nori \
    rubygems-rexml \
    rubygems-rubyntlm \
"

BBCLASSEXTEND = "native"
