# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rackup"
DESCRIPTION = "A general server command for Rack applications."
HOMEPAGE = "https://github.com/rack/rackup"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=3c4a0ca1cc9b7163465653ca29b4a461"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rack-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ba4fa15afa818400da4b779f25794dad"
SRC_URI[sha256sum] = "f737191fd5c5b348b7f0a4412a3b86383f88c43e13b8217b63d4c8d90b9e798d"

GEM_NAME = "rackup"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rack \
"

BBCLASSEXTEND = "native"
