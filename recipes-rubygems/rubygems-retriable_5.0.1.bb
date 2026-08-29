# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: retriable"
DESCRIPTION = "Retriable is a simple DSL to retry failed code blocks with randomized exponential backoff"
HOMEPAGE = "https://github.com/kamui/retriable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=618ad3e3c80f08c271f08d73ad93def5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "61a4f64c7f081c01b5f19e9f6dfa3607"
SRC_URI[sha256sum] = "181cc7ae5fe9b289b6611f0223ee8c5cd361175238fd602a2cd48c8b81c30742"

GEM_NAME = "retriable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
