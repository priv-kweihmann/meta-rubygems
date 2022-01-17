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

SRC_URI[md5sum] = "b629e516aea88419dcadaa418ec5e927"
SRC_URI[sha256sum] = "8fe4bc8ddd9962687b52cde9c86beca756775991981cf49e64b2327d4e599228"

GEM_NAME = "aws-sdk-networkfirewall"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
