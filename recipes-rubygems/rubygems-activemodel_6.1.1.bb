# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activemodel"
DESCRIPTION = "A toolkit for building modeling frameworks like Active Record"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=beb6db6f575459e4eb88269312cddd4e"

DEPENDS_class-native += "rubygems-activesupport-native"
RDEPENDS_${PN}_class-target += "rubygems-activesupport"

SRC_URI[md5sum] = "d1968f899dbab1062070b471eec5c885"
SRC_URI[sha256sum] = "b2b9d455446097e36968c009644a3c38345d1cbc449028e20a4bd43fb63fd12f"

GEM_NAME = "activemodel"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
