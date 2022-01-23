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

SRC_URI[md5sum] = "137641076885053f464213c95d8320e1"
SRC_URI[sha256sum] = "72370206c6e6eaba8ee323148870b7a4d09e466054dc84474e58462120323aa7"

GEM_NAME = "corefoundation"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
