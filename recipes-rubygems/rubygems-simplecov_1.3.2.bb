# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52dad7570cca15719f73693673f6f53a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "51fca3b7144967091483dc4045018441"
SRC_URI[sha256sum] = "2a22ec1759f1b8db60881a2e038758956fc69ef93ed669be0bde0678de6d0e85"

GEM_NAME = "simplecov"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
