# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppetmodule-netdev_stdlib"
DESCRIPTION = "NetDev Standard Library provides Puppet types to configure network devices"
HOMEPAGE = "https://github.com/puppetlabs/netdev_stdlib"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feb02a60806816ccd6f8bb5febc9ab68"

DEPENDS:class-native += "\
    rubygems-puppet-native \
"
RDEPENDS:${PN}:class-target += "\
    rubygems-puppet \
"

SRC_URI[md5sum] = "fe576e8783797c863af2a15315529ca7"
SRC_URI[sha256sum] = "cc3de2569dc477973e9bf0db2fd9e3d0fddc503c35c270ca6fa4a20ec6f28841"

GEM_NAME = "puppetmodule-netdev_stdlib"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
