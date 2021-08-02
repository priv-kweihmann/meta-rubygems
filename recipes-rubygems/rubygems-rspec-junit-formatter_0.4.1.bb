# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec_junit_formatter"
DESCRIPTION = "RSpec results that your continuous integration service can read."
HOMEPAGE = "http://github.com/sj26/rspec_junit_formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3c2235b9d32b4bad0c36172d4d7c619c"

DEPENDS:class-native += "rubygems-rspec-core-native"
RDEPENDS:${PN}:class-target += "rubygems-rspec-core"

SRC_URI[md5sum] = "d73b8e71c3081da34e7bcc4b3252bdda"
SRC_URI[sha256sum] = "3788f9b3fabc6284b93493cf4b3a80cba2b59b3a774b95f39dd7886d5faed6ab"

GEM_NAME = "rspec_junit_formatter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
