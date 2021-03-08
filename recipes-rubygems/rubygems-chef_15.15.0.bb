# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef"
DESCRIPTION = "A systems integration framework, built to bring the benefits of configuration management to your entire infrastructure."
HOMEPAGE = "https://www.chef.io"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS_class-native += "\
    rubygems-addressable-native \
    rubygems-bcrypt-pbkdf-native \
    rubygems-bundler-native \
    rubygems-chef-config-native \
    rubygems-chef-utils-native \
    rubygems-chef-zero-native \
    rubygems-diff-lcs-native \
    rubygems-ed25519-native \
    rubygems-erubis-native \
    rubygems-ffi-libarchive-native \
    rubygems-ffi-native \
    rubygems-ffi-yajl-native \
    rubygems-highline-native \
    rubygems-iniparse-native \
    rubygems-license-acceptance-native \
    rubygems-mixlib-archive-native \
    rubygems-mixlib-authentication-native \
    rubygems-mixlib-cli-native \
    rubygems-mixlib-log-native \
    rubygems-mixlib-shellout-native \
    rubygems-net-sftp-native \
    rubygems-net-ssh-multi-native \
    rubygems-net-ssh-native \
    rubygems-ohai-native \
    rubygems-plist-native \
    rubygems-proxifier-native \
    rubygems-syslog-logger-native \
    rubygems-train-core-native \
    rubygems-train-winrm-native \
    rubygems-tty-screen-native \
    rubygems-uuidtools-native \
"

SRC_URI[md5sum] = "f6b2c3be818c4d1c2888a9a7b3045984"
SRC_URI[sha256sum] = "16780ebfec3c8c0e7977cac93ab3004204701bdf6c8762ff5d1c907712ff1219"

GEM_NAME = "chef"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-bcrypt-pbkdf \
    rubygems-bundler \
    rubygems-chef-config \
    rubygems-chef-utils \
    rubygems-chef-zero \
    rubygems-diff-lcs \
    rubygems-ed25519 \
    rubygems-erubis \
    rubygems-ffi \
    rubygems-ffi-libarchive \
    rubygems-ffi-yajl \
    rubygems-highline \
    rubygems-iniparse \
    rubygems-license-acceptance \
    rubygems-mixlib-archive \
    rubygems-mixlib-authentication \
    rubygems-mixlib-cli \
    rubygems-mixlib-log \
    rubygems-mixlib-shellout \
    rubygems-net-sftp \
    rubygems-net-ssh \
    rubygems-net-ssh-multi \
    rubygems-ohai \
    rubygems-plist \
    rubygems-proxifier \
    rubygems-syslog-logger \
    rubygems-train-core \
    rubygems-train-winrm \
    rubygems-tty-screen \
    rubygems-uuidtools \
"

BBCLASSEXTEND = "native"
