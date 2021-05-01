# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sdk-kms-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "56acac04c70778d6555602ea58c3f895"
SRC_URI[sha256sum] = "69472bc01e8e783321448782a666734b1d14d13bf52901cfeb67062c9c0d2e85"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sdk-kms \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
