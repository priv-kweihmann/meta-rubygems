# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
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

SRC_URI[md5sum] = "01aeb50772dd44835da0e1a31a2f8199"
SRC_URI[sha256sum] = "b0c623199f1f46bd82c1d1fa0feef105ab8cfc6bd2f643d71cd1c289e11a9da9"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
