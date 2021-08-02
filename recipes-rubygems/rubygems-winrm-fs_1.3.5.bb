# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: winrm-fs"
DESCRIPTION = "Ruby library for file system operations via Windows Remote Management"
HOMEPAGE = "http://github.com/WinRb/winrm-fs"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS:class-native += "\
    rubygems-erubi-native \
    rubygems-logging-native \
    rubygems-rubyzip-native \
    rubygems-winrm-native \
"
RDEPENDS:${PN}:class-target += "\
    rubygems-erubi \
    rubygems-logging \
    rubygems-rubyzip \
    rubygems-winrm \
"

SRC_URI[md5sum] = "dcde27a3aff684b8277c069cd4b2efe7"
SRC_URI[sha256sum] = "0d2cdd9e1fb6fc8d01f56a32dce41d98ae6eefb481937ed0e058faa0cd0c693d"

GEM_NAME = "winrm-fs"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
