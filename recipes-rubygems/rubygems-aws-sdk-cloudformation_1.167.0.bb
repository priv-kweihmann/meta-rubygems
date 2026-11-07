# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
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

SRC_URI[md5sum] = "1071c9142ceeedf474128ba9c4ded535"
SRC_URI[sha256sum] = "525c8dd9732866d8f278d397bf19793fb887d6132dbb5e046f34670d1770d86c"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
