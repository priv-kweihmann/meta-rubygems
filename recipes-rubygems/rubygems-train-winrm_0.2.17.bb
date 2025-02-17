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

SRC_URI[md5sum] = "152adcc0a6141f23a8f555836da37b21"
SRC_URI[sha256sum] = "b30b3713e57e8fd1b32b218e6c89b45e13cbc5e02a7bbee993456885ea39b75b"

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
