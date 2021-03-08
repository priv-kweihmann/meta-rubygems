# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: iniparse"
DESCRIPTION = "A pure Ruby library for parsing INI documents"
HOMEPAGE = "http://github.com/antw/iniparse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=597bf79df435330d41384c9d6eab9a63"

SRC_URI[md5sum] = "1b8ad4813482f10398d2c26828a355d8"
SRC_URI[sha256sum] = "36a165e98d8a250b7631c4a7f9afba32af78f089970cd6446a39771189c761f1"

GEM_NAME = "iniparse"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
