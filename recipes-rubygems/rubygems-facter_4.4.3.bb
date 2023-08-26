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
    rubygems-sys-filesystem-native \
    rubygems-thor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "36d246c260ea6d48c0d49ae6c223b547"
SRC_URI[sha256sum] = "32d2dcada49322cbfa2850393fd86d52bf35828edb7306fc5e4f7f2b410811e0"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
    rubygems-sys-filesystem \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
