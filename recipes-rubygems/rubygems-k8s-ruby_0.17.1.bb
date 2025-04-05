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
    rubygems-eventmachine-native \
    rubygems-excon-native \
    rubygems-faye-websocket-native \
    rubygems-hashdiff-native \
    rubygems-jsonpath-native \
    rubygems-recursive-open-struct-native \
    rubygems-ruby-termios-native \
    rubygems-yajl-ruby-native \
    rubygems-yaml-safe-load-stream3-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b9c66189b61577939853e3a3a221c621"
SRC_URI[sha256sum] = "0e038efa10547822a9d0c54b6aaf295f33ce7d2bce41098565cce3673c82d6be"

GEM_NAME = "k8s-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-dry-configurable \
    rubygems-dry-struct \
    rubygems-dry-types \
    rubygems-eventmachine \
    rubygems-excon \
    rubygems-faye-websocket \
    rubygems-hashdiff \
    rubygems-jsonpath \
    rubygems-recursive-open-struct \
    rubygems-ruby-termios \
    rubygems-yajl-ruby \
    rubygems-yaml-safe-load-stream3 \
"

BBCLASSEXTEND = "native"
