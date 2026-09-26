# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52dad7570cca15719f73693673f6f53a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e05b618e5aa3ccd29d7e58c68121b989"
SRC_URI[sha256sum] = "b326d38e819053499aa2ebe35d544d8bd780eba143a50f48a624b450ad87feec"

GEM_NAME = "simplecov"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
