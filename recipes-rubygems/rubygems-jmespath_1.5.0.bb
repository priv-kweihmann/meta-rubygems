# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jmespath"
DESCRIPTION = "Implements JMESPath for Ruby"
HOMEPAGE = "http://github.com/trevorrowe/jmespath.rb"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8cc789b082b3d97e1ccc5261f8594d3f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f6b3c705e4ad5e45340f30129ceaa486"
SRC_URI[sha256sum] = "5679c7ff84947593421d26c626760e53b867960260c6b999a178b0864a8097fa"

GEM_NAME = "jmespath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
