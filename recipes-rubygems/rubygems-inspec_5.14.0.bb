# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://lib/plugins/inspec-init/templates/profiles/gcp/inspec.yml;beginline=6;endline=6;md5=cfb5ff7823bc166fac8853e293b76fd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-cookstyle-native \
    rubygems-faraday-middleware-native \
    rubygems-inspec-core-native \
    rubygems-mongo-native \
    rubygems-progress-bar-native \
    rubygems-rake-native \
    rubygems-train-aws-native \
    rubygems-train-habitat-native \
    rubygems-train-native \
    rubygems-train-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dfcd5f5045e3a2791497d8b159074d43"
SRC_URI[sha256sum] = "d6d76c565ec577c9d61e675eae8dc466962db7dbd1133f843eb879ccc2f473cc"

GEM_NAME = "inspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_generate_spec:append() {
    # temporary fix for hard mongo gem version binding
    sed -i 's#=[[:space:]]2.13.2#!=0#g' ${GEM_SPEC_FILE}
}

RDEPENDS:${PN}:class-target += "\
    rubygems-cookstyle \
    rubygems-faraday-middleware \
    rubygems-inspec-core \
    rubygems-mongo \
    rubygems-progress-bar \
    rubygems-rake \
    rubygems-train \
    rubygems-train-aws \
    rubygems-train-habitat \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
