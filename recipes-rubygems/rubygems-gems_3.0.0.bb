# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: gems"
DESCRIPTION = "A client for the RubyGems.org API and compatible hosts, with immutable response objects, trusted publishing, and retries"
HOMEPAGE = "https://github.com/rubygems/gems"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=67f1f1b4fa9dc220dc7f86767d3490e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b2130c0ab45cc3c0026c8cab8eccf301"
SRC_URI[sha256sum] = "a7c7853385dbf73b2f252c735c38eced146cce7530a39d4255751149f1cde696"

GEM_NAME = "gems"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
