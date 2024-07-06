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

SRC_URI[md5sum] = "3b9b051394477a0e2382e9f89521de8b"
SRC_URI[sha256sum] = "5b1dcb42aeac85cb9244458f6a2e6a56ee80ecdcc2a1feb5ed283afb68695b6c"

GEM_NAME = "aws-sdk-waf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
