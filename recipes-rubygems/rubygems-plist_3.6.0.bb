# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: plist"
DESCRIPTION = "Plist is a library to manipulate Property List files, also known as plists"
HOMEPAGE = "https://github.com/patsplat/plist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e8d008d5070d56bbd0361ddc7178b9e4"

SRC_URI[md5sum] = "ff419f2d7585ad4ed70abbb984e99af3"
SRC_URI[sha256sum] = "f468bcf6b72ec6d1585ed6744eb4817c1932a5bf91895ed056e69b7f12ca10f2"

GEM_NAME = "plist"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
