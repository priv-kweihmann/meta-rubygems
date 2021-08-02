# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: azure_mgmt_resources"
DESCRIPTION = "Microsoft Azure Resource Management Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS:class-native += "\
    rubygems-ms-rest-azure-native \
"

SRC_URI[md5sum] = "03ab36de027939b5f0fe9fc15e8dea13"
SRC_URI[sha256sum] = "a3cecdd5df10e05c43559d08c3f5a9d0ef7367ebb3425468751129d88fd290dc"

GEM_NAME = "azure_mgmt_resources"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ms-rest-azure \
"

BBCLASSEXTEND = "native"
