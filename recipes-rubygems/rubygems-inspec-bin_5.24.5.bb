# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/main/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-inspec-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1814a0f8c6c41e3a730609d32872fb12"
SRC_URI[sha256sum] = "9ed5400ef66699940aebee6bbd9b73e9996ead758d58925635d32c45b0fe9ff4"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
