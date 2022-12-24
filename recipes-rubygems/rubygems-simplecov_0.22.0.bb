# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov"
DESCRIPTION = "Code coverage for Ruby with a powerful configuration library and automatic merging of coverage across test suites"
HOMEPAGE = "https://github.com/simplecov-ruby/simplecov"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0372eac36f921e2a3d78dcb0bb6c4f76"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-docile-native \
    rubygems-simplecov-html-native \
    rubygems-simplecov-json-formatter-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "78469a20f4cacca73db3e6b8e6dd496d"
SRC_URI[sha256sum] = "fe2622c7834ff23b98066bb0a854284b2729a569ac659f82621fc22ef36213a5"

GEM_NAME = "simplecov"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-docile \
    rubygems-simplecov-html \
    rubygems-simplecov-json-formatter \
"

BBCLASSEXTEND = "native"
