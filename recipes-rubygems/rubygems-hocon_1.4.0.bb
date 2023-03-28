# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hocon"
DESCRIPTION = "== A port of the Java {Typesafe Config}[https://github.com/typesafehub/config] library to Ruby"
HOMEPAGE = "https://github.com/puppetlabs/ruby-hocon"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b6da1baf5b2a0b79dc9f2af2365f4521"
SRC_URI[sha256sum] = "e71023ed7c56ae780ec34c0ce7789a233bcead08c045d50bc7b3af40f5afcd80"

GEM_NAME = "hocon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
