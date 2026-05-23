# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: retriable"
DESCRIPTION = "Retriable is a simple DSL to retry failed code blocks with randomized exponential backoff"
HOMEPAGE = "https://github.com/kamui/retriable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=618ad3e3c80f08c271f08d73ad93def5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8646bb6b97dcbea368a6cf98785e9b4f"
SRC_URI[sha256sum] = "2e48ab1256ab2f18713f08786d2a58ec7b8a42bb5c791efa7e965f7bd2b915c0"

GEM_NAME = "retriable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
