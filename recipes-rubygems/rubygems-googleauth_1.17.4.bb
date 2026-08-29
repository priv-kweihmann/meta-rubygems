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
    rubygems-os-native \
    rubygems-pstore-native \
    rubygems-signet-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0d69f1a583e702c23bc400f3142cab35"
SRC_URI[sha256sum] = "acc2cac2a6011048f149c922cbc6c9675719e165aa5000c7fa3876c480fe9ae3"

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
    rubygems-os \
    rubygems-pstore \
    rubygems-signet \
"

BBCLASSEXTEND = "native"
