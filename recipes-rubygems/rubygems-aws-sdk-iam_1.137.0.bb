# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
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

SRC_URI[md5sum] = "7b02c4cb3845357e9b5b2069156f05e2"
SRC_URI[sha256sum] = "9aa1b33f657646567c946472933c3069271f93a3e65a7fc8edc859938928f9d7"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
