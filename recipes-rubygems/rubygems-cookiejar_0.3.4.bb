# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: cookiejar"
DESCRIPTION = "Allows for parsing and returning cookies in Ruby HTTP client code"
HOMEPAGE = "http://alkaline-solutions.com"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a584ea65c64074706c34e28d6e94a3a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f3cb5c276a151ef172afe7a743431aed"
SRC_URI[sha256sum] = "11b16acfc4baf7a0f463c21a6212005e04e25f5554d4d9f24d97f3492dfda0df"

GEM_NAME = "cookiejar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
