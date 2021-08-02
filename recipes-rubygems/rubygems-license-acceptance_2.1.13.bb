# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: license-acceptance"
DESCRIPTION = "Chef End User License Agreement Acceptance for Ruby products"
HOMEPAGE = "https://github.com/chef/license-acceptance/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS:class-native += "\
    rubygems-pastel-native \
    rubygems-tomlrb-native \
    rubygems-tty-box-native \
    rubygems-tty-prompt-native \
"
RDEPENDS:${PN}:class-target += "\
    rubygems-pastel \
    rubygems-tomlrb \
    rubygems-tty-box \
    rubygems-tty-prompt \
"

SRC_URI[md5sum] = "75443ee553d5e52d3e381fee22dffa95"
SRC_URI[sha256sum] = "eecb259b87adaebf162cd25e613b0e0f6d3005c92ffd76ddeca0c053e450058a"

GEM_NAME = "license-acceptance"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
