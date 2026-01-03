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

SRC_URI[md5sum] = "70d97f0d06f3d93bcef811030d8abf84"
SRC_URI[sha256sum] = "5cde93c894b30943a5d2b93c2fe9284216a6b756f7af406a1e55f211d97d10ad"

GEM_NAME = "faraday-follow_redirects"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
