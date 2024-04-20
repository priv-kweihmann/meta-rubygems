# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train"
DESCRIPTION = "Transport interface to talk to different backends."
HOMEPAGE = "https://github.com/inspec/train"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-activesupport-native \
    rubygems-azure-graph-rbac-native \
    rubygems-azure-mgmt-key-vault-native \
    rubygems-azure-mgmt-resources-native \
    rubygems-azure-mgmt-security-native \
    rubygems-azure-mgmt-storage-native \
    rubygems-docker-api-native \
    rubygems-google-apis-admin-directory-v1-native \
    rubygems-google-apis-cloudkms-v1-native \
    rubygems-google-apis-cloudresourcemanager-v1-native \
    rubygems-google-apis-compute-v1-native \
    rubygems-google-apis-iam-v1-native \
    rubygems-google-apis-monitoring-v3-native \
    rubygems-google-apis-storage-v1-native \
    rubygems-googleauth-native \
    rubygems-inifile-native \
    rubygems-train-core-native \
    rubygems-train-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6e355bf97dfba0ae6ecfa2f033496ff2"
SRC_URI[sha256sum] = "7e3fe3ea2763a564ff5d1261332fbc9ac787c766584d11d440bf760bd5d38dfc"

GEM_NAME = "train"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-activesupport \
    rubygems-azure-graph-rbac \
    rubygems-azure-mgmt-key-vault \
    rubygems-azure-mgmt-resources \
    rubygems-azure-mgmt-security \
    rubygems-azure-mgmt-storage \
    rubygems-docker-api \
    rubygems-google-apis-admin-directory-v1 \
    rubygems-google-apis-cloudkms-v1 \
    rubygems-google-apis-cloudresourcemanager-v1 \
    rubygems-google-apis-compute-v1 \
    rubygems-google-apis-iam-v1 \
    rubygems-google-apis-monitoring-v3 \
    rubygems-google-apis-storage-v1 \
    rubygems-googleauth \
    rubygems-inifile \
    rubygems-train-core \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
