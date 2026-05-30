# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: retriable"
DESCRIPTION = "Retriable is a simple DSL to retry failed code blocks with randomized exponential backoff"
HOMEPAGE = "https://github.com/kamui/retriable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=618ad3e3c80f08c271f08d73ad93def5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2aef87e90b610583dd075038d644f837"
SRC_URI[sha256sum] = "6c25151721cba9d5d1c0aa9dbb38012aee36dd84752069f13dec98e7f8b51cec"

GEM_NAME = "retriable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
