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

SRC_URI[md5sum] = "92f2305dbe91ef59ea5e96ff1440b8e5"
SRC_URI[sha256sum] = "1610731874b14013efb80923d87392f89afdf375b13b664cc302b5b50fc3d0dc"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
