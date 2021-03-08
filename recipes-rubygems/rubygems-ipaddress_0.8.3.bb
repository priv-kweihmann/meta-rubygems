# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ipaddress"
DESCRIPTION = "IPAddress is a Ruby library designed to make manipulation       of IPv4 and IPv6 addresses both powerful and simple"
HOMEPAGE = "https://github.com/bluemonk/ipaddress"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4e3f767de86883ec76018c80bf7cd875"

SRC_URI[md5sum] = "15c3ce3bcf68ecaee8d25070b033bcac"
SRC_URI[sha256sum] = "85640c4f9194c26937afc8c78e3074a8e7c97d5d1210358d1440f01034d006f5"

GEM_NAME = "ipaddress"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
