# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-waf"
DESCRIPTION = "Official AWS Ruby gem for AWS WAF (WAF)"
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

SRC_URI[md5sum] = "2f84ffdd2605dc7e574ea5905214735f"
SRC_URI[sha256sum] = "041ce512d724fb93e7402fb6923c25a0a6d3b67753ee6aac481cb206fb153e8d"

GEM_NAME = "aws-sdk-waf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
