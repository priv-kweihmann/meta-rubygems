# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-signer"
DESCRIPTION = "Official AWS Ruby gem for AWS Signer (signer)"
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

SRC_URI[md5sum] = "b8381503cb9be919c1a745015601a443"
SRC_URI[sha256sum] = "0e5a45e55250bcf372cbc278e7ef5f826bdfbb791a813e62397718f8468e98dc"

GEM_NAME = "aws-sdk-signer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
