# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52dad7570cca15719f73693673f6f53a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2f89e7066347eab4e3e875ee5f850569"
SRC_URI[sha256sum] = "c6459434efe4b948b46477cc2df2faa73ab365f83a33c7c17f81262f4f7f1244"

GEM_NAME = "simplecov"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
