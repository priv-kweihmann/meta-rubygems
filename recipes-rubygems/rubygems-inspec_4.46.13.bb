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
    rubygems-train-aws-native \
    rubygems-train-habitat-native \
    rubygems-train-native \
    rubygems-train-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3aeb4e50f41958b49b5fd55c187ecbe0"
SRC_URI[sha256sum] = "1fdc194a8a8313224d0181027037d90460846174d9909eb92560312c185c9080"

GEM_NAME = "inspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_generate_spec:append() {
    # temporary fix for hard mongo gem version binding
    sed -i 's#=[[:space:]]2.13.2#!=0#g' ${GEM_SPEC_FILE}
}

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday-middleware \
    rubygems-inspec-core \
    rubygems-mongo \
    rubygems-train \
    rubygems-train-aws \
    rubygems-train-habitat \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
