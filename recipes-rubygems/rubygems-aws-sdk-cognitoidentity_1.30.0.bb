# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cognitoidentity"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "59212388b84f4c8574a6d8bda3360454"
SRC_URI[sha256sum] = "82c0df34eacba4353d66a4e983b3ffe8ce0ae6cf34fe38b4f0411b605c34d83f"

GEM_NAME = "aws-sdk-cognitoidentity"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
