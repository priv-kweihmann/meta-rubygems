# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: retriable"
DESCRIPTION = "Retriable is a simple DSL to retry failed code blocks with randomized exponential backoff"
HOMEPAGE = "https://github.com/kamui/retriable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=618ad3e3c80f08c271f08d73ad93def5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "42461fb04fad364bdeabb14513b5da5b"
SRC_URI[sha256sum] = "b6a5a4000a0dc04fcbea0976d5af3bf62c142e8d2d5c85191369ed9ff8bdfe11"

GEM_NAME = "retriable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
