# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: proxifier"
DESCRIPTION = "Proxifier adds support for HTTP or SOCKS proxies and lets you force TCPSocket to use proxies."
HOMEPAGE = "https://github.com/samuelkadolph/ruby-proxifier"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c2d0482cd15154f57d3779fde9532d2"

SRC_URI[md5sum] = "abfb31d36a2ea4feac73cd2f0363feaa"
SRC_URI[sha256sum] = "40fef4d2c79313a12b8be2799146cb225b35665975a238ba0d513a96c6a37fa9"

GEM_NAME = "proxifier"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
