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

SRC_URI[md5sum] = "f69e333a72226b57fa60ec6df1d19a7e"
SRC_URI[sha256sum] = "0f7e6fc70e204cee1b2d71f1e1de2d3b349d432404197fe68ebf7fa23d0821b9"

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
