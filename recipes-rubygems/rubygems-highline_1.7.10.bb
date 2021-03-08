# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: highline"
DESCRIPTION = "A high-level IO library that provides validation, type conversion, and more forcommand-line interfaces"
HOMEPAGE = "https://github.com/JEG2/highline"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI[md5sum] = "955d50f4a33126445fffe384799513e5"
SRC_URI[sha256sum] = "1e147d5d20f1ad5b0e23357070d1e6d0904ae9f71c3c49e0234cf682ae3c2b06"

GEM_NAME = "highline"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
