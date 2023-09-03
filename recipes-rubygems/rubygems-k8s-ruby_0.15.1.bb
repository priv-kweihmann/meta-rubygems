# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: k8s-ruby"
DESCRIPTION = "Kubernetes client library for Ruby"
HOMEPAGE = "https://github.com/k8s-ruby/k8s-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d288374151252b25b3f07c9b149d7f83"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " bash"

DEPENDS:class-native += "\
    rubygems-dry-configurable-native \
    rubygems-dry-struct-native \
    rubygems-dry-types-native \
    rubygems-excon-native \
    rubygems-hashdiff-native \
    rubygems-jsonpath-native \
    rubygems-recursive-open-struct-native \
    rubygems-yajl-ruby-native \
    rubygems-yaml-safe-load-stream3-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8ac5ac0d450a6b3535bcf7c1320b84e6"
SRC_URI[sha256sum] = "9b147560e9df81556c6b837eaa859a53ab3a50ad37bec9bd9a29e3b6a2f132a5"

GEM_NAME = "k8s-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-configurable \
    rubygems-dry-struct \
    rubygems-dry-types \
    rubygems-excon \
    rubygems-hashdiff \
    rubygems-jsonpath \
    rubygems-recursive-open-struct \
    rubygems-yajl-ruby \
    rubygems-yaml-safe-load-stream3 \
"

BBCLASSEXTEND = "native"
