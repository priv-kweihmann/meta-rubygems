# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-accept"
DESCRIPTION = "Parse Accept and Accept-Language HTTP headers."
HOMEPAGE = "https://github.com/ioquatix/http-accept"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=27294bc726a1b874840f158af01d2aeb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d3ccd956e0e57608ae1e22f511837fdf"
SRC_URI[sha256sum] = "c439ead5671a2a648f754460d4fedb8af61086dc09f8d4465e2f78144bc6adf0"

GEM_NAME = "http-accept"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
