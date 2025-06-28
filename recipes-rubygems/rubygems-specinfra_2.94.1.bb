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

SRC_URI[md5sum] = "a93205579f82fca5cf3b099746bd3a20"
SRC_URI[sha256sum] = "8c7c2ae29c6c636d6bd06b4918dc4bddb30e8902667be220d7a6c57c0cdeebd2"

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
