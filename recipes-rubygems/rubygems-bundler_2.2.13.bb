# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bundler"
DESCRIPTION = "Bundler manages an application's dependencies through its entire life, across many machines, systematically and repeatably"
HOMEPAGE = "https://bundler.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=2da2850a649eee420c5eb08072a3cc95"

SRC_URI[md5sum] = "734953ed3984bb675406d7840b7310c4"
SRC_URI[sha256sum] = "d3f434e1ec75f212409b78000276b4b943feacf4c7c4f529d36965a0fe486e14"

GEM_NAME = "bundler"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
