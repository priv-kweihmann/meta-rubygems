# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ecr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Registry (Amazon ECR)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e53c700b4abf3430e1514e31632f6bf8"
SRC_URI[sha256sum] = "3f6a126f4259c4c0c39b3946ef21214d2ad05b8857c1535e0f663d7019d73728"

GEM_NAME = "aws-sdk-ecr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
