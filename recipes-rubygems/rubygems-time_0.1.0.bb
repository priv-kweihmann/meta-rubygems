# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: time"
DESCRIPTION = "Extends the Time class with methods for parsing and conversion."
HOMEPAGE = "https://github.com/ruby/time"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

SRC_URI[md5sum] = "bffed9019b179a2a35e5509b15cf4874"
SRC_URI[sha256sum] = "7e7fda2af5e2e299d55f7ec9832b682f383a90afd7f14dc607d630b050e5ceab"

GEM_NAME = "time"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
