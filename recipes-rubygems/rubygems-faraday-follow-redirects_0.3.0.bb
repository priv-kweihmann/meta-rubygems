# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-follow_redirects"
DESCRIPTION = "Faraday 2.x compatible extraction of FaradayMiddleware::FollowRedirects."
HOMEPAGE = "https://github.com/tisba/faraday-follow-redirects"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=571f6b2261da23f0ecb641192cdca5a6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "75fa678fa40b54a94e51efc1600a6461"
SRC_URI[sha256sum] = "d92d975635e2c7fe525dd494fcd4b9bb7f0a4a0ec0d5f4c15c729530fdb807f9"

GEM_NAME = "faraday-follow_redirects"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
