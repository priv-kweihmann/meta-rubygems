# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-elasticbeanstalk"
DESCRIPTION = "Official AWS Ruby gem for AWS Elastic Beanstalk (Elastic Beanstalk)"
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

SRC_URI[md5sum] = "35821df49903699d4b08c308b4027b95"
SRC_URI[sha256sum] = "2af036a472e68bd836001f807aea5489521b4dc5c9c6ee714ba625103e31dcd7"

GEM_NAME = "aws-sdk-elasticbeanstalk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
