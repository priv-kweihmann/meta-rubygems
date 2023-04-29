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

SRC_URI[md5sum] = "3fc0af68842912b7b11da02b329b88ff"
SRC_URI[sha256sum] = "b5d51512abc73d58342c3c47d52aaf170a4e2f6674104f75c09255f9e71d5d9c"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
