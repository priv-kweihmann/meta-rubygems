# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jmespath"
DESCRIPTION = "Implements JMESPath for Ruby"
HOMEPAGE = "http://github.com/trevorrowe/jmespath.rb"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8cc789b082b3d97e1ccc5261f8594d3f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fdd62edafbd40171f976a53ab349ae9e"
SRC_URI[sha256sum] = "238d774a58723d6c090494c8879b5e9918c19485f7e840f2c1c7532cf84ebcb1"

GEM_NAME = "jmespath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
