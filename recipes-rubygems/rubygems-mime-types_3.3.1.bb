# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types"
DESCRIPTION = "The mime-types library provides a library and registry for information aboutMIME content type definitions"
HOMEPAGE = "https://github.com/mime-types/ruby-mime-types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=09a98c393c03aebae76ad3f331969d0b"

DEPENDS_class-native += "rubygems-mime-types-data-native"
RDEPENDS_${PN}_class-target += "rubygems-mime-types-data"

SRC_URI[md5sum] = "fae2f22c277f5bccf74b12d264acb242"
SRC_URI[sha256sum] = "708f737e28ceef48b9a1bc041aa9eec46fa36eb36acb95e6b64a9889131541fe"

GEM_NAME = "mime-types"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
