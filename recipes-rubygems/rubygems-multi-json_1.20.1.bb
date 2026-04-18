# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including fast_jsonparser, Oj, Yajl, and the JSON gem."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dd284a2f05d8428ad986a209f6dc06ac"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5d4d14767ba2b79653c96c0abc4612c7"
SRC_URI[sha256sum] = "2f3934e805cc45ef91b551a1f89d0e9191abd06a5e04a2ef09a6a036c452ca6d"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
