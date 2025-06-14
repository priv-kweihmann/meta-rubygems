# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-winrm"
DESCRIPTION = "Allows applictaions using Train to speak to Windows using Remote Management; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-winrm"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-chef-winrm-elevated-native \
    rubygems-chef-winrm-fs-native \
    rubygems-chef-winrm-native \
    rubygems-syslog-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "57ea7dcce1d2309b952485f07e684f49"
SRC_URI[sha256sum] = "dcbb59483fb13598dc93c2e27998ec66c24374fb398e6add0da9911c86f1485a"

GEM_NAME = "train-winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-winrm \
    rubygems-chef-winrm-elevated \
    rubygems-chef-winrm-fs \
    rubygems-syslog \
"

BBCLASSEXTEND = "native"
