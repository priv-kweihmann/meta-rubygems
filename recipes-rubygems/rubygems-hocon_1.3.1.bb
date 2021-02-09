# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hocon"
DESCRIPTION = "== A port of the Java {Typesafe Config}[https://github.com/typesafehub/config] library to Ruby"
HOMEPAGE = "https://github.com/puppetlabs/ruby-hocon"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

SRC_URI[md5sum] = "9182e012c0d48d0512a1b49179616709"
SRC_URI[sha256sum] = "b65aba4db51987a0d1d504696f3ebd0a484d86f18f33d0e66deedeed36d92e56"

GEM_NAME = "hocon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
