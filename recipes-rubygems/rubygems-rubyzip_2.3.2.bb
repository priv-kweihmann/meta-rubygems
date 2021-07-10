# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "\
    file://samples/example_filesystem.rb;beginline=30;endline=31;md5=fafd70aa8bcac3f8b39a140662f1c0fb \
"

SRC_URI[md5sum] = "d8396c7f2cefde071353f2a09ee7d2f6"
SRC_URI[sha256sum] = "3f57e3935dc2255c414484fbf8d673b4909d8a6a57007ed754dde39342d2373f"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
