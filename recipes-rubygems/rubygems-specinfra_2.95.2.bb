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

SRC_URI[md5sum] = "6986259f491b3cb7c34483622827188b"
SRC_URI[sha256sum] = "e3773b3ab913d43300e394a1b58005f63d9e558328cb117c79391fbebfb89528"

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
