# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-amplify"
DESCRIPTION = "Official AWS Ruby gem for AWS Amplify (Amplify)"
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

SRC_URI[md5sum] = "2114e35e3d81debb3c6977fb1ada36bf"
SRC_URI[sha256sum] = "dffd3efdb8354b81b359003d05ed5ff7d6945a65744f34e8cdecb8e1cbd3305e"

GEM_NAME = "aws-sdk-amplify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
