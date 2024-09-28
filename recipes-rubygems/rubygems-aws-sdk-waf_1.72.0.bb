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

SRC_URI[md5sum] = "41ca4134a949847dee8b86979c67cd64"
SRC_URI[sha256sum] = "94ee47343fcc7b1eb20eca41f2bdffc7396f246d856135aa19aa34c3d576be16"

GEM_NAME = "aws-sdk-waf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
