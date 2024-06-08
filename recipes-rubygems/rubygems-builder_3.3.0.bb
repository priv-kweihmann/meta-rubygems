# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: builder"
DESCRIPTION = "Builder provides a number of builder objects that make creating structured datasimple to do"
HOMEPAGE = "https://github.com/rails/builder"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=343a457ff389ad704b1794e9b11e031e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3048be022111b96f47bb17c34c67dbc7"
SRC_URI[sha256sum] = "497918d2f9dca528fdca4b88d84e4ef4387256d984b8154e9d5d3fe5a9c8835f"

GEM_NAME = "builder"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
