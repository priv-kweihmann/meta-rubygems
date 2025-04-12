# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-kubernetes"
DESCRIPTION = "A Train transport plugin for Chef Inspec that allows testing of all Kubernetes API resources"
HOMEPAGE = "https://github.com/bgeesaman/train-kubernetes"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-k8s-ruby-native \
    rubygems-train-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c9b94a1d2d8089cec446b2e1b99ca285"
SRC_URI[sha256sum] = "8595d0f41bce5f37cea8791d7b2a9a0ea21202ec4052a0891b473546694ae985"

GEM_NAME = "train-kubernetes"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-k8s-ruby \
    rubygems-train \
"

BBCLASSEXTEND = "native"
