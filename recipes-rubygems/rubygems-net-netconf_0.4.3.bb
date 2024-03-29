# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-netconf"
DESCRIPTION = "Updated and maintained fork of the Juniper Ruby NetConf client"
HOMEPAGE = "https://github.com/kkirsche/net-netconf"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=cb641bc04cda31daea161b1bc15da69f"

DEPENDS:class-native += "\
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
    rubygems-nokogiri-native \
"
RDEPENDS:${PN}:class-target += "\
    rubygems-net-scp \
    rubygems-net-ssh \
    rubygems-nokogiri \
"

SRC_URI[md5sum] = "fa173b0965766a427d8692f6b31c85a4"
SRC_URI[sha256sum] = "615ec2054e39a00e58f1b96c51bf8502f2a89bd9a51bb681b0ccb9c78d7a1bfc"

GEM_NAME = "net-netconf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
