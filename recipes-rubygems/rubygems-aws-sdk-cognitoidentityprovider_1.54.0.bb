# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cognitoidentityprovider"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity Provider"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "3a965f0f4de5192dd2edb897615936b9"
SRC_URI[sha256sum] = "b5a5791acb45b0cb9053d2d392823effdec5e05c12ccfd949a4e0aebd13e150b"

GEM_NAME = "aws-sdk-cognitoidentityprovider"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
