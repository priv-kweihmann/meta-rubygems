# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby-progressbar"
DESCRIPTION = "Ruby/ProgressBar is an extremely flexible text progress bar library for Ruby"
HOMEPAGE = "https://github.com/jfelchner/ruby-progressbar"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5dfde5e6b899242178fcfd8ca5fee9bc"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3dd3c94ee81398e25f204e0368c4abee"
SRC_URI[sha256sum] = "433242aef7e13ab37d1e9cbd0d8d76f7d125f1a4e0222a7df7f19f8f13b5afe4"

GEM_NAME = "ruby-progressbar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
