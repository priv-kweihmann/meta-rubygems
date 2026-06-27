# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: retriable"
DESCRIPTION = "Retriable is a simple DSL to retry failed code blocks with randomized exponential backoff"
HOMEPAGE = "https://github.com/kamui/retriable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=618ad3e3c80f08c271f08d73ad93def5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5622ac787066fe981bc061b36ea52ce9"
SRC_URI[sha256sum] = "90c3b257472a1c02f2a3dfa64dd35a420f7a624cef1a5981e20fdac5730f8cdc"

GEM_NAME = "retriable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
