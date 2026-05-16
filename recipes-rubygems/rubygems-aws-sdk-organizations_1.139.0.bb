# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
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

SRC_URI[md5sum] = "83e5c1971a48006713ed1b877d3fb27c"
SRC_URI[sha256sum] = "f15f30abfd411e9428f56214140e3a2fdceac0942e132ae96a5bd664ef1cf2fa"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
