# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-amplify"
DESCRIPTION = "Official AWS Ruby gem for AWS Amplify (Amplify)"
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

SRC_URI[md5sum] = "f37f6fcaaafa906d5874f025566c2340"
SRC_URI[sha256sum] = "e04fe6748bcd06ae333ffaad904e55efa166e692bcd8dbb2d3490469c38b561e"

GEM_NAME = "aws-sdk-amplify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
