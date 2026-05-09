# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including fast_jsonparser, Oj, Yajl, and the JSON gem."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dd284a2f05d8428ad986a209f6dc06ac"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b9d356d3aa38d649a09497de8f7eca4f"
SRC_URI[sha256sum] = "e6126a31808e3b4d19f483c775ceac34df190dffa62adfb63a165ee14ba68080"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
