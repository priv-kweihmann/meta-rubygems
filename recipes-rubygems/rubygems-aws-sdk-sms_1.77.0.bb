# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-sms"
DESCRIPTION = "[DEPRECATED] Official AWS Ruby gem for AWS Server Migration Service (SMS)"
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

SRC_URI[md5sum] = "1d06f700c950ea3c38d42c2f52ab06b1"
SRC_URI[sha256sum] = "57d56e19ba7f1c17069fec11d9661cff3eb1c004b4118d89200626b5eb97b2a4"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
