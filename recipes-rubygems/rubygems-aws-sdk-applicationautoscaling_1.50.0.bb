# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-applicationautoscaling"
DESCRIPTION = "Official AWS Ruby gem for Application Auto Scaling"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "eb38f351589a616817dba9c4f3f1546b"
SRC_URI[sha256sum] = "3436b3feb7b67e8595ad0bd96c9922ed56ec855a9ebd0a194cb649e8000ab24f"

GEM_NAME = "aws-sdk-applicationautoscaling"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
