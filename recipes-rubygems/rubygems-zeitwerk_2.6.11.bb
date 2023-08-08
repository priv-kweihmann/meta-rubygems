# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: zeitwerk"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics"
HOMEPAGE = "https://github.com/fxn/zeitwerk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5812b5ac986b987e30b9a65d087d8cd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8d4528c15f1ae17832d1e44da686d7a6"
SRC_URI[sha256sum] = "ade72f223a75c91f3b02b2c941a57fb697bc443d615f38c28773185e08698dd7"

GEM_NAME = "zeitwerk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
