# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ses"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Email Service (Amazon SES)"
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

SRC_URI[md5sum] = "f015e99efa36bf2eeb52adf86d908403"
SRC_URI[sha256sum] = "2bec2dc0531395a5146c66d62098e26e46617e49ef3b0dca5391de1149e8f18f"

GEM_NAME = "aws-sdk-ses"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
