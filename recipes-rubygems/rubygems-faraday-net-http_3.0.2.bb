# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fe2ee661420646b1e1e30b5e6bfde96d"
SRC_URI[sha256sum] = "6882929abed8094e1ee30344a3369e856fe34530044630d1f652bf70ebd87e8d"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
