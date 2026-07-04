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

SRC_URI[md5sum] = "3367b95de1fc71f35b6b4e4277fea77f"
SRC_URI[sha256sum] = "236d6c29a84760f14a6b0a6664d5ecc21237775c400f2a91f18cd9ab2ca05e73"

GEM_NAME = "corefoundation"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
