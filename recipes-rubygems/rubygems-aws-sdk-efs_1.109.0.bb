# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-efs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic File System (EFS)"
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

SRC_URI[md5sum] = "fb85d492efd6bf93cf1c05582377a078"
SRC_URI[sha256sum] = "3d472472b130754bd501f98b72676801ca9dba9640341f052178d52d2318a161"

GEM_NAME = "aws-sdk-efs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
