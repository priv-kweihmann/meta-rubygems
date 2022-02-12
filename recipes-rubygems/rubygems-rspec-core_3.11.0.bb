# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-core"
DESCRIPTION = "BDD for Ruby"
HOMEPAGE = "https://github.com/rspec/rspec-core"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3a5e8c0f5c7198772d1cfaa59805376d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rspec-support-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9e3fd1f997c57bd16199e7e6fae488b7"
SRC_URI[sha256sum] = "46317850396fea47e6793dd5a7606c0816aa38f5149f4cd5de308495b89b1085"

GEM_NAME = "rspec-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
