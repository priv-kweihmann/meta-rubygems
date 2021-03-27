# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7 \
"

DEPENDS_class-native += "\
    rubygems-faraday-middleware-native \
    rubygems-inspec-core-native \
    rubygems-train-aws-native \
    rubygems-train-habitat-native \
    rubygems-train-native \
    rubygems-train-winrm-native \
"

SRC_URI[md5sum] = "62f5f385bd9b21a82896f408ccfe2c02"
SRC_URI[sha256sum] = "3de05d2a15feab655f75d04b4c3e82c4de3e8a6da498797da8167aeb7c0ff7e5"

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
