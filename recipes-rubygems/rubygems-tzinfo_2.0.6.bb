# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tzinfo"
DESCRIPTION = "TZInfo provides access to time zone data and allows times to be converted using time zone rules."
HOMEPAGE = "https://tzinfo.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fffa95b51a9d05bf1f9443e62529dfe1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d625a56fe1f8cf5fb9ccfa3ecb0f50ee"
SRC_URI[sha256sum] = "8daf828cc77bcf7d63b0e3bdb6caa47e2272dcfaf4fbfe46f8c3a9df087a829b"

GEM_NAME = "tzinfo"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
"

BBCLASSEXTEND = "native"
