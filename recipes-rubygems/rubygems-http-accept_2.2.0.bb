# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-accept"
DESCRIPTION = "Parse Accept and Accept-Language HTTP headers."
HOMEPAGE = "https://github.com/ioquatix/http-accept"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lib/http/accept/media_types/map.rb;beginline=5;endline=21;md5=7f7c2007e48f6b5170afcdeeda85abc0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d397d6a718c80d15bba354a37729a27e"
SRC_URI[sha256sum] = "d589cfc6409d41862fa6b73e225a0237ffa9f66d5cd606c67a80872f82390ee7"

GEM_NAME = "http-accept"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
