# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including fast_jsonparser, Oj, Yajl, and the JSON gem."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=dd284a2f05d8428ad986a209f6dc06ac"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5158b7667132aeb7afd7398cb1a61b0c"
SRC_URI[sha256sum] = "245531eaf54bdba57aba515ff08b4503505c5e09911daa89c5a561e2f85bea8e"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
