# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: zeitwerk"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics"
HOMEPAGE = "https://github.com/fxn/zeitwerk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5812b5ac986b987e30b9a65d087d8cd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9565f6ce26b5f2fd62be59f78c4136b2"
SRC_URI[sha256sum] = "f5584ae0c274f9d799acebb01eca9bc31051db284287f3b4ed6b5673853c7825"

GEM_NAME = "zeitwerk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
