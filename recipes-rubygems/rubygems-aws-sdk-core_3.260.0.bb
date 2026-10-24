# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-eventstream-native \
    rubygems-aws-partitions-native \
    rubygems-aws-sigv4-native \
    rubygems-base64-native \
    rubygems-bigdecimal-native \
    rubygems-jmespath-native \
    rubygems-logger-native \
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d7eaed456414eea2ce7f4cedea1406e9"
SRC_URI[sha256sum] = "cb09c6c0ca86f2779e8672ae214c044f07b76f2540d81f44c894d465f8a68bd5"

GEM_NAME = "aws-sdk-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sigv4 \
    rubygems-base64 \
    rubygems-bigdecimal \
    rubygems-jmespath \
    rubygems-logger \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
