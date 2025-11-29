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
    rubygems-unf-ext-native \
    rubygems-uuidtools-native \
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f607f8153fcd1fb1f401302b9a7b4d75"
SRC_URI[sha256sum] = "85220e9f3db8ee0cd0697f08baa8f7f0bc4bc2920bd03c7191a6f41b5450588a"

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
    rubygems-unf-ext \
    rubygems-uuidtools \
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
