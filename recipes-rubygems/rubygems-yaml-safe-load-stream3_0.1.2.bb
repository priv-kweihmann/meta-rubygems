# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yaml-safe_load_stream3"
DESCRIPTION = "The Ruby standard library defines YAML.safe_load and YAML.load_stream but there's no way to safely load a multi document stream"
HOMEPAGE = "https://github.com/inspec/yaml-safe_load_stream3"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d288374151252b25b3f07c9b149d7f83"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dbca8fdb42f1e62cedb8e12a26ccf2e2"
SRC_URI[sha256sum] = "fd4f63ffe57e65ec8fd5a314064151f843e83239ff87bfc6b2fdbdba81e7e481"

GEM_NAME = "yaml-safe_load_stream3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
