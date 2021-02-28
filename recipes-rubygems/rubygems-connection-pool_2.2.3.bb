# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

SRC_URI[md5sum] = "1ccc96dc7feb55947fe7ec6799ba19b3"
SRC_URI[sha256sum] = "8e5bf44b6bfa96f5c94a5c30ae2447fce3dbcc0828a855a6c513fdb015a133e2"

GEM_NAME = "connection_pool"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
