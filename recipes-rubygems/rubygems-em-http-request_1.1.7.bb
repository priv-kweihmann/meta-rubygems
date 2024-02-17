# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: em-http-request"
DESCRIPTION = "EventMachine based, async HTTP Request client"
HOMEPAGE = "http://github.com/igrigorik/em-http-request"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://spec/stallion.rb;beginline=3;endline=3;md5=ba6765537baa7902811a7ef979236a2a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-cookiejar-native \
    rubygems-em-socksify-native \
    rubygems-eventmachine-native \
    rubygems-http-parser.rb-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "67d67f338c9455c55b95c52740699d09"
SRC_URI[sha256sum] = "16fbc72b2a6e20c804c564ac5d12e98668c6fcef8c3b1dd2387dff505f2efdab"

GEM_NAME = "em-http-request"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-cookiejar \
    rubygems-em-socksify \
    rubygems-eventmachine \
    rubygems-http-parser.rb \
"

BBCLASSEXTEND = "native"
