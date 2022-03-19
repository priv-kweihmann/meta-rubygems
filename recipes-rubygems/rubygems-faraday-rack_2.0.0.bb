# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-rack"
DESCRIPTION = "Faraday adapter for Rack"
HOMEPAGE = "https://github.com/lostisland/faraday-rack"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3633c44746f1f4a11febca8fd82ec61b"
SRC_URI[sha256sum] = "41759651c9e8baba520c21f807a8787dbb8480c2dbe64569264346ffad6b0461"

GEM_NAME = "faraday-rack"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
