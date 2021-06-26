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

SRC_URI[md5sum] = "765f79e5e623c45cef6decfc965cab80"
SRC_URI[sha256sum] = "b37564f4fc3bc66f3f98d3032b8bb8cbdbd23ba0f7c02648287048463cf70f4f"

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
