# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hiera"
DESCRIPTION = "A pluggable data store for hierarcical data"
HOMEPAGE = "https://github.com/puppetlabs/hiera"

LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://COPYING;md5=67c01e92d4ae704f266de057db62d718"

SRC_URI[md5sum] = "c1975a0cad3df4ba6cf64d07be219f75"
SRC_URI[sha256sum] = "a77b182673a04955b444001dc80c15fe549dfc707254790be572a76dfcecf954"

GEM_NAME = "hiera"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
