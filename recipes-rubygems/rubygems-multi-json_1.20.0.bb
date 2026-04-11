# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including fast_jsonparser, Oj, Yajl, and the JSON gem."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dd284a2f05d8428ad986a209f6dc06ac"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9551548556082f91ff627d344dfca322"
SRC_URI[sha256sum] = "c64106fae5114bd7f388d42d7b52ebb83d7726426d47a35ad5099e35bb923e41"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
