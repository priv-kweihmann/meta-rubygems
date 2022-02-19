# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: corefoundation"
DESCRIPTION = "Ruby wrapper for macOS Core Foundation framework"
HOMEPAGE = "http://github.com/chef/corefoundation"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1814884814f0a48dea9ee270f29af6f6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " \
    libffi \
"

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3968463cfd0c318536d965ecce3e84d0"
SRC_URI[sha256sum] = "29c07766cc1d7e428b116b9ebe03b16bb829ef9104f0fa8fff899a61daf02f93"

GEM_NAME = "corefoundation"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
