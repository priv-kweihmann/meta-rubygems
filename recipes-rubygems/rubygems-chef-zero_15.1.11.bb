# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-zero"
DESCRIPTION = "Self-contained, easy-setup, fast-start in-memory Chef server for testing and solo setup purposes"
HOMEPAGE = "https://github.com/chef/chef-zero"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3b00fddfc284541383b18aaccf46781"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ffi-yajl-native \
    rubygems-hashie-native \
    rubygems-mixlib-log-native \
    rubygems-rack-native \
    rubygems-rackup-native \
    rubygems-uuidtools-native \
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c541cff67b61a55528d047a4511b8e58"
SRC_URI[sha256sum] = "1882ad6bca87d0100c27b0ad5927acd31136f3b2ff291e0afddbd5344818b8ec"

GEM_NAME = "chef-zero"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi-yajl \
    rubygems-hashie \
    rubygems-mixlib-log \
    rubygems-rack \
    rubygems-rackup \
    rubygems-uuidtools \
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
