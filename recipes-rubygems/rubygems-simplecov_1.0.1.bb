# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52dad7570cca15719f73693673f6f53a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f00973580f5c8026ab7404fa3c218f1c"
SRC_URI[sha256sum] = "419d93c40484159d20b40e26e9a83cdd4c3afa2f3fd443bb8946c301cd658d75"

GEM_NAME = "simplecov"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
