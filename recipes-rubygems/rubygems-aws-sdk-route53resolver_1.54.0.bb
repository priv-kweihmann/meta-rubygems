# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
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

SRC_URI[md5sum] = "6b641a6ae9413a8b7480c36ee899bd59"
SRC_URI[sha256sum] = "6003872762fef12e529b6263fb2d67e81917a11630f86652c573e80250e1ad34"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
