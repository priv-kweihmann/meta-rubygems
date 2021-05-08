# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7"

DEPENDS_class-native += "\
    rubygems-faraday-middleware-native \
    rubygems-inspec-core-native \
    rubygems-train-aws-native \
    rubygems-train-habitat-native \
    rubygems-train-native \
    rubygems-train-winrm-native \
"

SRC_URI[md5sum] = "7c6e5f768a8d84d1089925776f190e26"
SRC_URI[sha256sum] = "24fd03365fc58a165f4f9b94f8287a20dce8a5877e04ff2c778ad18f5271bd09"

GEM_NAME = "inspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-faraday-middleware \
    rubygems-inspec-core \
    rubygems-train \
    rubygems-train-aws \
    rubygems-train-habitat \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
