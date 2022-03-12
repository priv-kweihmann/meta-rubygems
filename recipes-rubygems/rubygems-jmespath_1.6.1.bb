# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jmespath"
DESCRIPTION = "Implements JMESPath for Ruby"
HOMEPAGE = "http://github.com/trevorrowe/jmespath.rb"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8cc789b082b3d97e1ccc5261f8594d3f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3c84a5f234039163185a7ec31c628d0f"
SRC_URI[sha256sum] = "40ca83f4141bdd1e503db5485de68b84237183d84cf7a159fbeebcc6005adbd6"

GEM_NAME = "jmespath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
