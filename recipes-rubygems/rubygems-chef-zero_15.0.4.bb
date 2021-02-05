# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-zero"
DESCRIPTION = "Self-contained, easy-setup, fast-start in-memory Chef server for testing and solo setup purposes"
HOMEPAGE = "https://github.com/chef/chef-zero"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-ffi-yajl-native \
    rubygems-hashie-native \
    rubygems-mixlib-log-native \
    rubygems-rack-native \
    rubygems-uuidtools-native \
    rubygems-webrick-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-ffi-yajl \
    rubygems-hashie \
    rubygems-mixlib-log \
    rubygems-rack \
    rubygems-uuidtools \
    rubygems-webrick \
"

SRC_URI[md5sum] = "a00156fa94546e3dac6d3182c97f37c2"
SRC_URI[sha256sum] = "8d776ea3b4e0a5c3acf429ca2343643e5c6ae5c8cf8d228756710ff7eec0bb1b"

GEM_NAME = "chef-zero"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
