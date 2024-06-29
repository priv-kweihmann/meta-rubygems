# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-codecommit"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeCommit (CodeCommit)"
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

SRC_URI[md5sum] = "800417d79bd73b923f696920b7c2eb8f"
SRC_URI[sha256sum] = "560282693ba381cc839563eebb5cfe3741d34d5370c0d9a63f824eae30710187"

GEM_NAME = "aws-sdk-codecommit"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
