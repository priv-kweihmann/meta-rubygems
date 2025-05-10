# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ecs"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Service (Amazon ECS)"
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

SRC_URI[md5sum] = "46629c4de62e3c4f4817d43c30d8eb23"
SRC_URI[sha256sum] = "79460fa0d8641b2349fb3ba4b102e38dd2941d4db319efe5a864b9b7149d35f2"

GEM_NAME = "aws-sdk-ecs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
