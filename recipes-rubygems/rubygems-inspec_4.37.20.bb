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

SRC_URI[md5sum] = "1980f9f461f27e66a618ffcc852d3689"
SRC_URI[sha256sum] = "796c6ae042a0cfcc2df981db91f030bb3e13fa7a8601577bdd0449062da3a9cf"

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
