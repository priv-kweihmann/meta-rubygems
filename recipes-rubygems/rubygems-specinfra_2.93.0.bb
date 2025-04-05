# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: specinfra"
DESCRIPTION = "Common layer for serverspec and itamae"
HOMEPAGE = "https://github.com/mizzy/specinfra"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9f1e84c559b0d54e801ddbe1457c114a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
    rubygems-net-telnet-native \
    rubygems-sfl-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1689a03d490d4977ae6b8e608de87df3"
SRC_URI[sha256sum] = "d35799eef6280ef7f1084e3900d6f8dba8d2e6d88b96c4bc49038819f23a2860"

GEM_NAME = "specinfra"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_generate_spec:append() {
    # lift version restriction on net-telnet
    sed -i 's#= 0.1.1#>= 0.1.1#g' ${GEM_SPEC_FILE}
}

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-net-scp \
    rubygems-net-ssh \
    rubygems-net-telnet \
    rubygems-sfl \
"

BBCLASSEXTEND = "native"
