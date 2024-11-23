# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mutex_m"
DESCRIPTION = "Mixin to extend objects to be handled like a Mutex."
HOMEPAGE = "https://github.com/ruby/mutex_m"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=5b8c87559868796979806100db3f3805"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c6c20b45ee2d65a62d72489ef6618599"
SRC_URI[sha256sum] = "cfcb04ac16b69c4813777022fdceda24e9f798e48092a2b817eb4c0a782b0751"

GEM_NAME = "mutex_m"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
