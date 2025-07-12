# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-zero"
DESCRIPTION = "Self-contained, easy-setup, fast-start in-memory Chef server for testing and solo setup purposes"
HOMEPAGE = "https://github.com/chef/chef-zero"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3b00fddfc284541383b18aaccf46781"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
    rubygems-ffi-yajl-native \
    rubygems-hashie-native \
    rubygems-mixlib-log-native \
    rubygems-rack-native \
    rubygems-rackup-native \
    rubygems-unf-ext-native \
    rubygems-uuidtools-native \
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "95c2a59f58973f87da28cb691832b39c"
SRC_URI[sha256sum] = "f4a6115f8d1aa1901fe12d4d7b63496cec7e6f4260d90097adbdf0cb110ae6cb"

GEM_NAME = "chef-zero"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
    rubygems-ffi-yajl \
    rubygems-hashie \
    rubygems-mixlib-log \
    rubygems-rack \
    rubygems-rackup \
    rubygems-unf-ext \
    rubygems-uuidtools \
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
