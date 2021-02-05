# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: highline"
DESCRIPTION = "A high-level IO library that provides validation, type conversion, and more forcommand-line interfaces"
HOMEPAGE = "https://github.com/JEG2/highline"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[md5sum] = "be63a46ed7eabcae9a4cf53032dba5bc"
SRC_URI[sha256sum] = "2ddd5c127d4692721486f91737307236fe005352d12a4202e26c48614f719479"

GEM_NAME = "highline"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
