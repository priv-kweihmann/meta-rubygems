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
    rubygems-train-kubernetes-native \
    rubygems-train-native \
    rubygems-train-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9995093f971982c65ab6d9ed435a9a14"
SRC_URI[sha256sum] = "1b798fe5445d625eb08abbd371e79a0a891335331721ed219369fdc923000874"

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
    rubygems-train-kubernetes \
    rubygems-train-winrm \
"

BBCLASSEXTEND = "native"
