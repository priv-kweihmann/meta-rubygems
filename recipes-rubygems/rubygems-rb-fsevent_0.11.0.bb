# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rb-fsevent"
DESCRIPTION = "FSEvents API with Signals catching (without RubyCocoa)"
HOMEPAGE = "http://rubygems.org/gems/rb-fsevent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0f54ca712fa5d09964ad633d7ab46d36"

SRC_URI[md5sum] = "4917afbf78a17a3804cb0c8f64b245d8"
SRC_URI[sha256sum] = "3a02b6360c856cc16e7f62382573b238f5cfb61a48169dd4c83b842c094b5de3"

GEM_NAME = "rb-fsevent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
