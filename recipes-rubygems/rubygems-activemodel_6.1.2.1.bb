# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=beb6db6f575459e4eb88269312cddd4e"

DEPENDS_class-native += "\
    rubygems-activesupport-native \
"

SRC_URI[md5sum] = "fefed5ad5d3ed7b159acb33925573e72"
SRC_URI[sha256sum] = "d19e1931217ed00fafe69fe98d9ee92d385f6a92ac7200a844a5f9b4c548a4ee"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-activesupport \
"

BBCLASSEXTEND = "native"
