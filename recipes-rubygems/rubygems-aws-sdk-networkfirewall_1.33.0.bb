# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-networkfirewall"
DESCRIPTION = "Official AWS Ruby gem for AWS Network Firewall (Network Firewall)"
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

SRC_URI[md5sum] = "b85a1fcdc5106d0bd37f4ae1f24c7f5e"
SRC_URI[sha256sum] = "2e23696e3b6c95c55ffff9505e450140fa8f73299b66e1afaa73af0939054409"

GEM_NAME = "aws-sdk-networkfirewall"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
