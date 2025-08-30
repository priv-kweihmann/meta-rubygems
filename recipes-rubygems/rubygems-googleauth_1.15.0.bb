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
    rubygems-google-cloud-env-native \
    rubygems-google-logging-utils-native \
    rubygems-jwt-native \
    rubygems-multi-json-native \
    rubygems-os-native \
    rubygems-signet-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ac295df8d9b51663e3c264471491f84a"
SRC_URI[sha256sum] = "122ae61813805a1cfdf225638f33d354ca6078be17e9712669667226a7243bcf"

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
    rubygems-google-cloud-env \
    rubygems-google-logging-utils \
    rubygems-jwt \
    rubygems-multi-json \
    rubygems-os \
    rubygems-signet \
"

BBCLASSEXTEND = "native"
