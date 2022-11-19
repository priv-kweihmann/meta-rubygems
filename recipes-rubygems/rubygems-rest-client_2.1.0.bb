# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rest-client"
DESCRIPTION = "A simple HTTP and REST client for Ruby, inspired by the Sinatra microframework style of specifying actions: get, put, post, delete."
HOMEPAGE = "https://github.com/rest-client/rest-client"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8d4c0cdd6bc54a36dbe54c0f2fa70797"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-http-accept-native \
    rubygems-http-cookie-native \
    rubygems-mime-types-native \
    rubygems-netrc-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "75e3de74cdcd29e6c1179090723a0258"
SRC_URI[sha256sum] = "35a6400bdb14fae28596618e312776c158f7ebbb0ccad752ff4fa142bf2747e3"

GEM_NAME = "rest-client"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-http-accept \
    rubygems-http-cookie \
    rubygems-mime-types \
    rubygems-netrc \
"

BBCLASSEXTEND = "native"
