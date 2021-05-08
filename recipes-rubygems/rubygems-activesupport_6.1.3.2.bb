# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=a2e0e281b9b6c47f722da2255eca5d68"

DEPENDS_class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-i18n-native \
    rubygems-minitest-native \
    rubygems-tzinfo-native \
    rubygems-zeitwerk-native \
"

SRC_URI[md5sum] = "1863d3975e3f2f631abc802791d43159"
SRC_URI[sha256sum] = "d9074834deca6676aabd432f16c392e991eca1f675cbcefc38671a0a7d6b5db3"

GEM_NAME = "activesupport"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-concurrent-ruby \
    rubygems-i18n \
    rubygems-minitest \
    rubygems-tzinfo \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
