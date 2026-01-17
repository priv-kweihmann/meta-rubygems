# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-inflector"
DESCRIPTION = "String inflections for dry-rb"
HOMEPAGE = "https://dry-rb.org/gems/dry-inflector"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0ee4068f5fe5f7970e70f95ff8b2184e"
SRC_URI[sha256sum] = "7fb0c2bb04f67638f25c52e7ba39ab435d922a3a5c3cd196120f63accb682dcc"

GEM_NAME = "dry-inflector"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
