# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
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

SRC_URI[md5sum] = "029ebbfdc44fd9effe8e273ad147c56e"
SRC_URI[sha256sum] = "a2cb03306b747ba3d91269e2d188f0bd9e981323546448851a1df57b5f36037b"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
