# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-eventbridge"
DESCRIPTION = "Official AWS Ruby gem for Amazon EventBridge"
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

SRC_URI[md5sum] = "eaaec9d41242f4ee6fb4caef9728c06c"
SRC_URI[sha256sum] = "478848ac96d9933d90e6d7c35c4076025483cc1f7e3a9a2585163f7c88da534b"

GEM_NAME = "aws-sdk-eventbridge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
