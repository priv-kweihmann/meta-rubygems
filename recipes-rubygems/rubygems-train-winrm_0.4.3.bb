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

SRC_URI[md5sum] = "fb9e70859bd8de8b86c1b456e3da0327"
SRC_URI[sha256sum] = "4fa35666f24254984fec1d3bf677c510f180531219ba0f4feb09293df98784fa"

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
