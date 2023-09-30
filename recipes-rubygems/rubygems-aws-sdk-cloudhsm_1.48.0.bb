# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudhsm"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudHSM (CloudHSM)"
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

SRC_URI[md5sum] = "99bb4920211f0313930c07531b3ac2ab"
SRC_URI[sha256sum] = "486f39c06cf833afe0defa745d94a5c41d62eb1204f52fda5daf64b02c2e4f3b"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
