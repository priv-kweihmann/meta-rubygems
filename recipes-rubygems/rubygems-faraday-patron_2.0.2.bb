# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-patron"
DESCRIPTION = "Faraday adapter for Patron"
HOMEPAGE = "https://github.com/lostisland/faraday-patron"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-patron-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "280c6fb974bb330e3bc446b946206530"
SRC_URI[sha256sum] = "cd4b77d48e3c638ce25c22b6affe2714cf13af99bfa8348c1c7f6733fc5f2086"

GEM_NAME = "faraday-patron"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-patron \
"

BBCLASSEXTEND = "native"
