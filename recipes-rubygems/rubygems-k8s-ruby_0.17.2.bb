# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: k8s-ruby"
DESCRIPTION = "Kubernetes client library for Ruby"
HOMEPAGE = "https://github.com/k8s-ruby/k8s-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d288374151252b25b3f07c9b149d7f83"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " \
    bash \
"

DEPENDS:class-native += "\
    rubygems-base64-native \
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

SRC_URI[md5sum] = "6e91472f14dab4f9ebaa0fa4fd10a5b9"
SRC_URI[sha256sum] = "9197c70ea7547a06fdc5534c81b00740622a0ccfb12416fc6c06af141b59071b"

GEM_NAME = "k8s-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
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
