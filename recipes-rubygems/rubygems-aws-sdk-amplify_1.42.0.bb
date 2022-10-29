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

SRC_URI[md5sum] = "e76da9c93587cbdb6dcce4297b035427"
SRC_URI[sha256sum] = "9ae9249ab17f5110197f360b60341aaa9c6eae40ef580288aea9ce659b4a9f7a"

GEM_NAME = "aws-sdk-amplify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
