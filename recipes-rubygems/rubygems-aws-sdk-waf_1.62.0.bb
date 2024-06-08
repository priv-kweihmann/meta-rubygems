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

SRC_URI[md5sum] = "1debe1fd1421629be275a5084652dfb0"
SRC_URI[sha256sum] = "f97252f3524a77e715f902773f71989714c506cd774bb13b260c717dbde73224"

GEM_NAME = "aws-sdk-waf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
