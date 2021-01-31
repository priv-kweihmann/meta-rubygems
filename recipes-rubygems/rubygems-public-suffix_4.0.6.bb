# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: public_suffix"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, domain and subdomains."
HOMEPAGE = "https://simonecarletti.com/code/publicsuffix-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4c89161c761aa8e9188cee9f19125f9c"

DEPENDS_class-native += ""
RDEPENDS_${PN}_class-target += ""

SRC_URI[md5sum] = "a8709e7242bf05183a56e10fca4d0e9d"
SRC_URI[sha256sum] = "a99967c7b2d1d2eb00e1142e60de06a1a6471e82af574b330e9af375e87c0cf7"

GEM_NAME = "public_suffix"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
