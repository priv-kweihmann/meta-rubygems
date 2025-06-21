# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-em_synchrony"
DESCRIPTION = "Faraday adapter for EM::Synchrony"
HOMEPAGE = "https://github.com/lostisland/faraday-em_synchrony"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2e11c73913bb59b6bf260cd8f365b00f"
SRC_URI[sha256sum] = "bf3ce45dcf543088d319ab051f80985ea6d294930635b7a0b966563179f81750"

GEM_NAME = "faraday-em_synchrony"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
