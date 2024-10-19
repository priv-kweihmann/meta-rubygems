# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-macie2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Macie 2"
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

SRC_URI[md5sum] = "bfaec2cc1f2ddeef761ed435bac87031"
SRC_URI[sha256sum] = "f9383831c406716288c5bd1d2dac7b798bc2ef1b2230b5c13ad382cb6feb4865"

GEM_NAME = "aws-sdk-macie2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
