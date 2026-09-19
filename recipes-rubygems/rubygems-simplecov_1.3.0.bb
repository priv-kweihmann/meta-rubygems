# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52dad7570cca15719f73693673f6f53a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2ac556c156fd36c0881d7ab6cafa8fd9"
SRC_URI[sha256sum] = "d9886307863c1ead47657dcbed869bfffd82318808b09014d8f0ff77dcfe7492"

GEM_NAME = "simplecov"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
