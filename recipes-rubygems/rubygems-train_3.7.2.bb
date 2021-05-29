# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train"
DESCRIPTION = "Transport interface to talk to different backends."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-activesupport-native \
    rubygems-azure-graph-rbac-native \
    rubygems-azure-mgmt-key-vault-native \
    rubygems-azure-mgmt-resources-native \
    rubygems-azure-mgmt-security-native \
    rubygems-azure-mgmt-storage-native \
    rubygems-docker-api-native \
    rubygems-google-api-client-native \
    rubygems-googleauth-native \
    rubygems-inifile-native \
    rubygems-train-core-native \
    rubygems-train-winrm-native \
"

SRC_URI[md5sum] = "0a1cba7fff82a4499199244c1746b3e3"
SRC_URI[sha256sum] = "f9d72d312a3a913ebc0d0bf56a8ef3d33128ffc28cc2766f3be46aa8a0da1eb2"

GEM_NAME = "train"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-activesupport \
    rubygems-azure-graph-rbac \
    rubygems-azure-mgmt-key-vault \
    rubygems-azure-mgmt-resources \
    rubygems-azure-mgmt-security \
    rubygems-azure-mgmt-storage \
    rubygems-docker-api \
    rubygems-google-api-client \
    rubygems-googleauth \
    rubygems-inifile \
    rubygems-train-core \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
