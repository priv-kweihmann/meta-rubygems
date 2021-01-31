# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=a2e0e281b9b6c47f722da2255eca5d68"

DEPENDS_class-native += "rubygems-concurrent-ruby-native \
                  rubygems-i18n-native \
                  rubygems-minitest-native \
                  rubygems-tzinfo-native \
                  rubygems-zeitwerk-native"
RDEPENDS_${PN}_class-target += "rubygems-concurrent-ruby \
                  rubygems-i18n \
                  rubygems-minitest \
                  rubygems-tzinfo \
                  rubygems-zeitwerk"

SRC_URI[md5sum] = "94fae5877c0d1e6fa2e839e11211768e"
SRC_URI[sha256sum] = "a1d7d91586b2bbebb93f931802e5b1ceab565137d0769c55d9941052de85ea22"

GEM_NAME = "activesupport"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
