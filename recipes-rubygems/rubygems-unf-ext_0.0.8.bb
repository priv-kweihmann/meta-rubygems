# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unf_ext"
DESCRIPTION = "Unicode Normalization Form support library for CRuby"
HOMEPAGE = "https://github.com/knu/ruby-unf_ext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eeabce56bdb2bf10564523e7b9e42412"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c9edacd569f20eca47bcf350cbc7980e"
SRC_URI[sha256sum] = "cd8f69915afccd3766400bf4f5f18038a57a75a2efde4c21fabfc96b6f8dab4a"

GEM_NAME = "unf_ext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
