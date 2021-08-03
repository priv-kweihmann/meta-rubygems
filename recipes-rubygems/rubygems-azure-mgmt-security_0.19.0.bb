# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: azure_mgmt_security"
DESCRIPTION = "Microsoft Azure Security Management Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS:class-native += "\
    rubygems-ms-rest-azure-native \
"

SRC_URI[md5sum] = "e799a6a6d8a30228baa36a78fff6d1a4"
SRC_URI[sha256sum] = "e281c9f6ba0998dfddedaea4baff6318b37ab098070622dd6ef17345be6f0286"

GEM_NAME = "azure_mgmt_security"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ms-rest-azure \
"

BBCLASSEXTEND = "native"
