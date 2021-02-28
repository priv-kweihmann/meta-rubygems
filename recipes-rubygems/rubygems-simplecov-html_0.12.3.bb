# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov-html"
DESCRIPTION = "Default HTML formatter for SimpleCov code coverage tool for ruby 2.4+"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov-html"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23973b4bd84f8a5e081dd23bb739394d"

SRC_URI[md5sum] = "2f0241c3a12f5af62bd84c1f1914a722"
SRC_URI[sha256sum] = "4b1aad33259ffba8b29c6876c12db70e5750cb9df829486e4c6e5da4fa0aa07b"

GEM_NAME = "simplecov-html"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
