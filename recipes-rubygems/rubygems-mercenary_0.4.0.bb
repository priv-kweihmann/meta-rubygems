# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mercenary"
DESCRIPTION = "Lightweight and flexible library for writing command-line apps in Ruby."
HOMEPAGE = "https://github.com/jekyll/mercenary"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a8f56631a8cc9c1d0b0ef11290556bf9"

SRC_URI[md5sum] = "8bc01b5577bc5738bd5130aa51929236"
SRC_URI[sha256sum] = "b25a1e4a59adca88665e08e24acf0af30da5b5d859f7d8f38fba52c28f405138"

GEM_NAME = "mercenary"

EXTRA_RDEPENDS += "bash"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
