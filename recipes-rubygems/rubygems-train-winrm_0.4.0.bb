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
    rubygems-socksify-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cdc3d1a50a67cdc506e9cf632a909784"
SRC_URI[sha256sum] = "07b1911900707f6a7f9ea758b5bba1657d154f33d061761ba4d55967a4d17fd9"

GEM_NAME = "train-winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-winrm \
    rubygems-chef-winrm-elevated \
    rubygems-chef-winrm-fs \
    rubygems-socksify \
"

BBCLASSEXTEND = "native"
