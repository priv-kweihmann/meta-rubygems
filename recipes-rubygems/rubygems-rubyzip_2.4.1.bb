# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://samples/example_filesystem.rb;beginline=30;endline=31;md5=fafd70aa8bcac3f8b39a140662f1c0fb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "65bec5b3ce75f81232428ed19f51908b"
SRC_URI[sha256sum] = "8577c88edc1fde8935eb91064c5cb1aef9ad5494b940cf19c775ee833e075615"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
