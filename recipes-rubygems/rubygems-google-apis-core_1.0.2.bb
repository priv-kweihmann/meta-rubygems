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

SRC_URI[md5sum] = "2a89a7f0d0d1ac67db4174f7fc8e6458"
SRC_URI[sha256sum] = "ba4579aaadc902d6cc7bc8db88f566ab00f5e31ea87ab41e9f9a032c470f2629"

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
