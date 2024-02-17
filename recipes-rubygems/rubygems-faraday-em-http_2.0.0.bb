# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-em_http"
DESCRIPTION = "Faraday adapter for Em::Http"
HOMEPAGE = "https://github.com/lostisland/faraday-em_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-em-http-request-native \
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cd54434b4b53c59bc35ff764ea14f8fc"
SRC_URI[sha256sum] = "8aaf9ba5a3743bc24d47c42ca9871e96975013d06285f87579430fde2b6c3f37"

GEM_NAME = "faraday-em_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-em-http-request \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
