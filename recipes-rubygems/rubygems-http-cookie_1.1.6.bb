# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-cookie"
DESCRIPTION = "HTTP::Cookie is a Ruby library to handle HTTP Cookies based on RFC 6265"
HOMEPAGE = "https://github.com/sparklemotion/http-cookie"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ac66e3bfd4a0a136794899462149afa8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-domain-name-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3828bc12c6c0006c6b1daba164efe7ba"
SRC_URI[sha256sum] = "ba4b82be64de61dc281243dac70e3c382c45142f20268ed9276a3670c93feaa9"

GEM_NAME = "http-cookie"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-domain-name \
"

BBCLASSEXTEND = "native"
