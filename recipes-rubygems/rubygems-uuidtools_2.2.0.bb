# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: uuidtools"
DESCRIPTION = "A simple universally unique ID generation library."
HOMEPAGE = "https://github.com/sporkmonger/uuidtools"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f124bfaefacd4e1a4080065d403bc1d4"

SRC_URI[md5sum] = "a683e19cc711202eed0b005fcf37401e"
SRC_URI[sha256sum] = "c4aed168141746d2357ce907626b83998084aeb3c6ac16670ae902a462191069"

GEM_NAME = "uuidtools"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
