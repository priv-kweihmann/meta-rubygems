# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sfl"
DESCRIPTION = "Spawn For Ruby 1.8"
HOMEPAGE = "https://github.com/ujihisa/spawn-for-legacy"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://LICENCE.md;md5=5ab409cfe3c71735fb5a170646878740"

SRC_URI[md5sum] = "939318640f582f6e9f39a8853335bb01"
SRC_URI[sha256sum] = "99739e51c33062e3964e1802a700ee9cd8d0f9c389b2a07f8a5fdf84e186a4e2"

GEM_NAME = "sfl"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
