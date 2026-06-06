# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-core"
DESCRIPTION = "Common utility and base classes for legacy Google REST clients"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-faraday-follow-redirects-native \
    rubygems-faraday-native \
    rubygems-googleauth-native \
    rubygems-mini-mime-native \
    rubygems-representable-native \
    rubygems-retriable-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f00b8904c5c9ef2660838b26e212fe86"
SRC_URI[sha256sum] = "965e5e3d87541ab619942f91bc3247a0eee2cd38ee149e48c2d3d3291f95ccec"

GEM_NAME = "google-apis-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-faraday \
    rubygems-faraday-follow-redirects \
    rubygems-googleauth \
    rubygems-mini-mime \
    rubygems-representable \
    rubygems-retriable \
"

BBCLASSEXTEND = "native"
