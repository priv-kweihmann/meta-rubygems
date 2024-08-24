# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unf"
DESCRIPTION = "This is a wrapper library to bring Unicode Normalization Form supportto Ruby/JRuby."
HOMEPAGE = "https://github.com/knu/ruby-unf"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f82c6dbc2ac1850fd92347bda995df43"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "21979c875cced01a64b996b61290146c"
SRC_URI[sha256sum] = "e6bcc2e101d80e3f9459753db747d5926aada1aaaf61e629e93359da9a5b04ab"

GEM_NAME = "unf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
