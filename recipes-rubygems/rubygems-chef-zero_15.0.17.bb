# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-zero"
DESCRIPTION = "Self-contained, easy-setup, fast-start in-memory Chef server for testing and solo setup purposes"
HOMEPAGE = "https://github.com/chef/chef-zero"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d1afc36971ed0d4287123b94ea00ec39"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
    rubygems-ffi-yajl-native \
    rubygems-hashie-native \
    rubygems-mixlib-log-native \
    rubygems-rack-native \
    rubygems-rackup-native \
    rubygems-uuidtools-native \
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1b336a0ae34463530040b2dd81d9b9b9"
SRC_URI[sha256sum] = "423e18499b5e07aa1b8cbcaa1c9102f5bd5edf5f692f64b1d0e9ea9181087357"

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
    rubygems-uuidtools \
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
