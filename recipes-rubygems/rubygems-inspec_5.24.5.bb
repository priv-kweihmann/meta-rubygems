# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

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

SRC_URI[md5sum] = "8eaf974d36614cf0b41cd5d6b6990525"
SRC_URI[sha256sum] = "77c248026924256d93c808e8e9d792f7808834ca1247d3a6c883f99860b166b5"

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
