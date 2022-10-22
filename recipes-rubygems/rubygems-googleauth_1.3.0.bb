# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: googleauth"
DESCRIPTION = "Implements simple authorization for accessing Google APIs, and provides support for Application Default Credentials."
HOMEPAGE = "https://github.com/googleapis/google-auth-library-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10c2a85445c418fe8265c4ad0963535b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
    rubygems-jwt-native \
    rubygems-memoist-native \
    rubygems-multi-json-native \
    rubygems-os-native \
    rubygems-signet-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a4238655ff0a1002de40eb66b410c6fb"
SRC_URI[sha256sum] = "51dd7362353cf1e90a2d01e1fb94321ae3926c776d4dc4a79db65230217ffcc2"

GEM_NAME = "googleauth"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # to avoid bash dependency
    rm -rf ${D}${libdir}/ruby/gems/${GEMLIB_VERSION}/gems/${GEM_NAME}-${PV}/.kokoro/
}

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
    rubygems-jwt \
    rubygems-memoist \
    rubygems-multi-json \
    rubygems-os \
    rubygems-signet \
"

BBCLASSEXTEND = "native"
