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

SRC_URI[md5sum] = "fca3d2853871368e8d019f41c42ebc5b"
SRC_URI[sha256sum] = "005659ce9dd356dd5d2acb4bcdcc5915291f4a312447b500af3b75aab564951b"

GEM_NAME = "rspec-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
