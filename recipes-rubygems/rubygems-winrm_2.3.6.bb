# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: winrm"
DESCRIPTION = "Ruby library for Windows Remote Management"
HOMEPAGE = "https://github.com/WinRb/WinRM"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

DEPENDS_class-native += "\
    rubygems-builder-native \
    rubygems-erubi-native \
    rubygems-gssapi-native \
    rubygems-gyoku-native \
    rubygems-httpclient-native \
    rubygems-logging-native \
    rubygems-nori-native \
    rubygems-rubyntlm-native \
"

SRC_URI[md5sum] = "a99f8e81343f61caa441eb1397a1c6ae"
SRC_URI[sha256sum] = "11351dd050447823a1c83adb3c55041f4aefe55f6ee513b70dae87768832ae5b"

GEM_NAME = "winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-builder \
    rubygems-erubi \
    rubygems-gssapi \
    rubygems-gyoku \
    rubygems-httpclient \
    rubygems-logging \
    rubygems-nori \
    rubygems-rubyntlm \
"

BBCLASSEXTEND = "native"
