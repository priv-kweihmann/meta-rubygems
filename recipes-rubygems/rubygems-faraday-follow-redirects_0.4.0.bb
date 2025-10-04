# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-follow_redirects"
DESCRIPTION = "Faraday 1.x and 2.x compatible extraction of FaradayMiddleware::FollowRedirects."
HOMEPAGE = "https://github.com/tisba/faraday-follow-redirects"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=571f6b2261da23f0ecb641192cdca5a6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6840c5029cc71868f6c3925347be5c8c"
SRC_URI[sha256sum] = "d3fa1118ab1350e24035a272b4cff64948643bb7182846db89acaf87abadd5d9"

GEM_NAME = "faraday-follow_redirects"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
