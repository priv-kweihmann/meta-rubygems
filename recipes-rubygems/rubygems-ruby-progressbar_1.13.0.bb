# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby-progressbar"
DESCRIPTION = "Ruby/ProgressBar is an extremely flexible text progress bar library for Ruby"
HOMEPAGE = "https://github.com/jfelchner/ruby-progressbar"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5dfde5e6b899242178fcfd8ca5fee9bc"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3e515f9efab3583fa5ef6009480ef8e7"
SRC_URI[sha256sum] = "80fc9c47a9b640d6834e0dc7b3c94c9df37f08cb072b7761e4a71e22cff29b33"

GEM_NAME = "ruby-progressbar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
