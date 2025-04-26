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

SRC_URI[md5sum] = "6d127e2e0eef2cb5b6f952d6265949cd"
SRC_URI[sha256sum] = "d2f025970de2a25977110f93e5e15c3db4890c7bff582363ad80036e3abdfbd4"

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
