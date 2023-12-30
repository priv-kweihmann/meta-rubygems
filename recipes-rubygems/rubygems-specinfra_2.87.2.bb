# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: specinfra"
DESCRIPTION = "Common layer for serverspec and itamae"
HOMEPAGE = "https://github.com/mizzy/specinfra"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9f1e84c559b0d54e801ddbe1457c114a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
    rubygems-net-telnet-native \
    rubygems-sfl-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ae201ccdbbf522a6e1122f5c40e4e3b0"
SRC_URI[sha256sum] = "969dcf7d5bcd39222bd2abf9371c9a23bb677754750bccc6976c728d6b51a521"

GEM_NAME = "specinfra"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_generate_spec:append() {
    # lift version restriction on net-telnet
    sed -i 's#= 0.1.1#>= 0.1.1#g' ${GEM_SPEC_FILE}
}

RDEPENDS:${PN}:class-target += "\
    rubygems-net-scp \
    rubygems-net-ssh \
    rubygems-net-telnet \
    rubygems-sfl \
"

BBCLASSEXTEND = "native"
