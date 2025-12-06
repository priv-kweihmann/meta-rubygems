# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yard"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language.    It enables the user to generate consistent, usable documentation that can be    exported to a number of formats very easily, and also supports extending for    custom Ruby constructs such as custom class level definitions."
HOMEPAGE = "http://yardoc.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b6f9769ae84eb7b621febf5cc8c5c62"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "16bdc9ef862e3a5b5f8d8a61aa225f28"
SRC_URI[sha256sum] = "721fb82afb10532aa49860655f6cc2eaa7130889df291b052e1e6b268283010f"

GEM_NAME = "yard"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
