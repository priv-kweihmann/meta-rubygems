# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yajl-ruby"
DESCRIPTION = "Ruby C bindings to the excellent Yajl JSON stream-based parser library."
HOMEPAGE = "http://github.com/brianmario/yajl-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dbd3a9f471247a243db5b62fe091587"

SRC_URI[md5sum] = "3736b65ee7a68a17796e642c1a0c3a5d"
SRC_URI[sha256sum] = "6e32e6e681c2861e99e7389ebcca70d56cb9357b223f09fb0857e2444ee1609b"

GEM_NAME = "yajl-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
