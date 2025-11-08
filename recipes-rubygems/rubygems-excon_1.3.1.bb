# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "740043ed105c8fa62f42f992878f1156"
SRC_URI[sha256sum] = "bdf66805b7095105e45f7f36244f65c021d2d04a8453757a5d731e6a02587dbb"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
"

BBCLASSEXTEND = "native"
