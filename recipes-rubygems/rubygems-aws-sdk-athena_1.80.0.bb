# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
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

SRC_URI[md5sum] = "1d9806e3e3aecd9de4037a291391f43d"
SRC_URI[sha256sum] = "4385c05295ac296de78e6a228f01b2538bf01508649b3dd90a9fad0f7a8aa0e1"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
