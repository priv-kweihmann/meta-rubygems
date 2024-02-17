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

SRC_URI[md5sum] = "828c2218614fc99431ec97aef34c8b54"
SRC_URI[sha256sum] = "eb918eec7332da49976c6b32d81f6c4702b814b9a9f25e8ed8ece64b9ce4b747"

GEM_NAME = "train-kubernetes"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-k8s-ruby \
    rubygems-train \
"

BBCLASSEXTEND = "native"
