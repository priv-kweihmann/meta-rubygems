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

SRC_URI[md5sum] = "8d90a1cce15da5fe132042faa598ea96"
SRC_URI[sha256sum] = "46bf3d76cc4726a8a50650eb9ff23aa43f0d9bc471a02042589696736a4d9a83"

GEM_NAME = "aws-sdk-ses"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
