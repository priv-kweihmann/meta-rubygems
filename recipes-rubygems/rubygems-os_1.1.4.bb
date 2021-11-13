# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: os"
DESCRIPTION = "The OS gem allows for some useful and easy functions, like OS.windows? (=> true or false) OS.bits ( => 32 or 64) etc"
HOMEPAGE = "http://github.com/rdp/os"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aa851a3e1acb73dc5b21ac9fd29ee6f7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6b7f4dacc80a123f9dc8b1f3158e5eea"
SRC_URI[sha256sum] = "57816d6a334e7bd6aed048f4b0308226c5fb027433b67d90a9ab435f35108d3f"

GEM_NAME = "os"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
