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
    rubygems-googleauth-native \
    rubygems-httpclient-native \
    rubygems-mini-mime-native \
    rubygems-representable-native \
    rubygems-retriable-native \
    rubygems-rexml-native \
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9b5bae28d538b9b3aad9fb4fcfdd0566"
SRC_URI[sha256sum] = "bb1bb19dac8e8295a2a9396e3793c3fe643a950fbc27d7277ebb4cc3369b461b"

GEM_NAME = "google-apis-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-googleauth \
    rubygems-httpclient \
    rubygems-mini-mime \
    rubygems-representable \
    rubygems-retriable \
    rubygems-rexml \
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
