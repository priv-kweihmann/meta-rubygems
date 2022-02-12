# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rb-fsevent"
DESCRIPTION = "FSEvents API with Signals catching (without RubyCocoa)"
HOMEPAGE = "http://rubygems.org/gems/rb-fsevent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0f54ca712fa5d09964ad633d7ab46d36"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "704d3cc0d916569395500c3516fd08b4"
SRC_URI[sha256sum] = "d585e0211cacbb793b4444e911212b3733f7dfb1c3016cb6c5fcacd8f7058519"

GEM_NAME = "rb-fsevent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
