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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ac60922383ad6c484132a1648fcb6739"
SRC_URI[sha256sum] = "febcbbd87abc8a2a5cab383d13ce494796d00189fe3c0f15c452710447eabdb3"

GEM_NAME = "train-winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-winrm \
    rubygems-chef-winrm-elevated \
    rubygems-chef-winrm-fs \
"

BBCLASSEXTEND = "native"
