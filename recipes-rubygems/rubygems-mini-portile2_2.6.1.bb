# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simplistic port-like solution for developers"
HOMEPAGE = "https://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

SRC_URI[md5sum] = "9271663118e11fbeec96c40b0c78d182"
SRC_URI[sha256sum] = "385fd7a2f3cda0ea5a0cb85551a936da941d7580fc9037a75dea820843aa7dd3"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
