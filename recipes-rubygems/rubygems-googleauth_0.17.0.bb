# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: googleauth"
DESCRIPTION = "Allows simple authorization for accessing Google APIs.   Provide support for Application Default Credentials, as described at   https://developers.google.com/accounts/docs/application-default-credentials"
HOMEPAGE = "https://github.com/googleapis/google-auth-library-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10c2a85445c418fe8265c4ad0963535b"

DEPENDS:class-native += "\
    rubygems-faraday-native \
    rubygems-jwt-native \
    rubygems-memoist-native \
    rubygems-multi-json-native \
    rubygems-os-native \
    rubygems-signet-native \
"

SRC_URI[md5sum] = "a6659347f51ba2d81c7a24c96fe9321b"
SRC_URI[sha256sum] = "988594556ca5319e5fca21b263f152a9b97df1e1024ccdf780d828563a7e020c"

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
