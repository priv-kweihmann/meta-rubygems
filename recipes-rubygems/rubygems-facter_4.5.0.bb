# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: facter"
DESCRIPTION = "You can prove anything with facts!"
HOMEPAGE = "https://github.com/puppetlabs/facter"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72bcf758cb771bfde198d175d9e48429"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-hocon-native \
    rubygems-thor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b10500668a69db77ddb65907be2bd908"
SRC_URI[sha256sum] = "c4263ae04a517f3759b4885c22c1b99093fdc416e9e639c763445e158cf92643"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
