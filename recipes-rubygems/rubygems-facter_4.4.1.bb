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

SRC_URI[md5sum] = "29d79df43a390f0be595867cc3003b71"
SRC_URI[sha256sum] = "a0191cc0236c50ca6a53e37d007d1ba4540f32131e380486a450d7ff41d47a6f"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
