# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-middleware-native \
    rubygems-inspec-core-native \
    rubygems-mongo-native \
    rubygems-progress-bar-native \
    rubygems-rake-native \
    rubygems-train-aws-native \
    rubygems-train-habitat-native \
    rubygems-train-kubernetes-native \
    rubygems-train-native \
    rubygems-train-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8f24675e2c1e85c13e66ea27c6db3ebe"
SRC_URI[sha256sum] = "71d8a2c1e539ab566f33c5b886f71a827ae1725b070fe9141e0fe95a2eab0d5e"

GEM_NAME = "inspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-middleware \
    rubygems-inspec-core \
    rubygems-mongo \
    rubygems-progress-bar \
    rubygems-rake \
    rubygems-train \
    rubygems-train-aws \
    rubygems-train-habitat \
    rubygems-train-kubernetes \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"