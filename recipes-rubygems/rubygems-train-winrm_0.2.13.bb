# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-winrm"
DESCRIPTION = "Allows applictaions using Train to speak to Windows using Remote Management; handles authentication, cacheing, and SDK dependency management."
HOMEPAGE = "https://github.com/inspec/train-winrm"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-winrm-elevated-native \
    rubygems-winrm-fs-native \
    rubygems-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bfc4a6e85134ea6ae896a59f93a51f79"
SRC_URI[sha256sum] = "ab0bae0366c2e200d8c84492863d2098b299e6794566156b05e03179208f0a1e"

GEM_NAME = "train-winrm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-winrm \
    rubygems-winrm-elevated \
    rubygems-winrm-fs \
"

BBCLASSEXTEND = "native"
