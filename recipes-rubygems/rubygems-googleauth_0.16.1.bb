# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: googleauth"
DESCRIPTION = "Allows simple authorization for accessing Google APIs.   Provide support for Application Default Credentials, as described at   https://developers.google.com/accounts/docs/application-default-credentials"
HOMEPAGE = "https://github.com/googleapis/google-auth-library-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10c2a85445c418fe8265c4ad0963535b"

DEPENDS_class-native += "\
    rubygems-faraday-native \
    rubygems-jwt-native \
    rubygems-memoist-native \
    rubygems-multi-json-native \
    rubygems-os-native \
    rubygems-signet-native \
"

SRC_URI[md5sum] = "f5e3322c8b83d594506b3e92895ce43b"
SRC_URI[sha256sum] = "566a17835f4c412f21bc57a79f32451e84152446d11e6cdc6b9958d221556890"

GEM_NAME = "googleauth"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install_append() {
    # to avoid bash dependency
    rm -rf ${D}${libdir}/ruby/gems/${GEMLIB_VERSION}/gems/${GEM_NAME}-${PV}/.kokoro/
}

RDEPENDS_${PN}_class-target += "\
    rubygems-faraday \
    rubygems-jwt \
    rubygems-memoist \
    rubygems-multi-json \
    rubygems-os \
    rubygems-signet \
"

BBCLASSEXTEND = "native"
