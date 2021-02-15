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

SRC_URI[md5sum] = "86ec790a2a10eedf3a704d43a7c04a0d"
SRC_URI[sha256sum] = "7155b715636faa2970123501f2356d3dc7390dcd9f2f9cb455f91e5d5b4ee250"

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
