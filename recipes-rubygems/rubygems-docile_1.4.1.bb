# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: docile"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific language) within a given block"
HOMEPAGE = "https://ms-ati.github.io/docile/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b3f621a34beb804b35794f00084ef8c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3de8db90caf04722a3e85224a0a4801e"
SRC_URI[sha256sum] = "96159be799bfa73cdb721b840e9802126e4e03dfc26863db73647204c727f21e"

GEM_NAME = "docile"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
