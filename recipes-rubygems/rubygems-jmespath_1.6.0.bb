# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jmespath"
DESCRIPTION = "Implements JMESPath for Ruby"
HOMEPAGE = "http://github.com/trevorrowe/jmespath.rb"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8cc789b082b3d97e1ccc5261f8594d3f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c6fcdea0ef024f459536f4c7a6ec0933"
SRC_URI[sha256sum] = "d96a8517a669a531562a9f353af6b5b3424ff497a0a50ba71e7450d66ec959be"

GEM_NAME = "jmespath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
