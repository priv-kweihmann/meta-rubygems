# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: equalizer"
DESCRIPTION = "Equalizer provides a simple way to define equality(==), equivalence (eql?), and hashing (hash) methodsfor Ruby objects based on specified attributes"
HOMEPAGE = "https://github.com/dkubb/equalizer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca458efd7f8bf8cb0d4bdeacec413242"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cb2dbb15694de4b1f0e7e2b3f72569e8"
SRC_URI[sha256sum] = "44a029a9f4f6043949977b140e257f6d2fdc71c9e450da2e361765741f50d322"

GEM_NAME = "equalizer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
