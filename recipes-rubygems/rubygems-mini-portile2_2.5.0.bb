# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simplistic port-like solution for developers"
HOMEPAGE = "http://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

SRC_URI[md5sum] = "996b17722d57f7ce20c6cafc64a2e60a"
SRC_URI[sha256sum] = "a7a7a09d646619d8efb0898169806266bf2982c70cc131fd285aa25e55bdabc1"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
