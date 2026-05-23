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

SRC_URI[md5sum] = "6670e6c21d75c683674387323fc3b10f"
SRC_URI[sha256sum] = "eff2aff86fd0e832c4d55e16d9e2ac3322e72483189e07ef41126818dccb4f53"

GEM_NAME = "aws-sdk-waf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
