# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef"
DESCRIPTION = "A systems integration framework, built to bring the benefits of configuration management to your entire infrastructure."
HOMEPAGE = "https://www.chef.io"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_RDEPENDS += "make bash"

DEPENDS_class-native += "\
    rubygems-addressable-native \
    rubygems-bcrypt-pbkdf-native \
    rubygems-bundler-native \
    rubygems-chef-config-native \
    rubygems-chef-utils-native \
    rubygems-chef-vault-native \
    rubygems-chef-zero-native \
    rubygems-diff-lcs-native \
    rubygems-ed25519-native \
    rubygems-erubis-native \
    rubygems-ffi-libarchive-native \
    rubygems-ffi-native \
    rubygems-ffi-yajl-native \
    rubygems-highline-native \
    rubygems-iniparse-native \
    rubygems-inspec-core-native \
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
    rubygems-pastel-native \
    rubygems-plist-native \
    rubygems-proxifier-native \
    rubygems-syslog-logger-native \
    rubygems-train-core-native \
    rubygems-train-winrm-native \
    rubygems-tty-prompt-native \
    rubygems-tty-screen-native \
    rubygems-tty-table-native \
    rubygems-uuidtools-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-addressable \
    rubygems-bcrypt-pbkdf \
    rubygems-bundler \
    rubygems-chef-config \
    rubygems-chef-utils \
    rubygems-chef-vault \
    rubygems-chef-zero \
    rubygems-diff-lcs \
    rubygems-ed25519 \
    rubygems-erubis \
    rubygems-ffi \
    rubygems-ffi-libarchive \
    rubygems-ffi-yajl \
    rubygems-highline \
    rubygems-iniparse \
    rubygems-inspec-core \
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
    rubygems-pastel \
    rubygems-plist \
    rubygems-proxifier \
    rubygems-syslog-logger \
    rubygems-train-core \
    rubygems-train-winrm \
    rubygems-tty-prompt \
    rubygems-tty-screen \
    rubygems-tty-table \
    rubygems-uuidtools \
"

SRC_URI[md5sum] = "e83e39e7c359d68ee14f41bf1e696f25"
SRC_URI[sha256sum] = "f40a0718e1b304a3a9b971c7b274de278cfadaa95efdb987c7b5eb994e3afeca"

GEM_NAME = "chef"

do_install_append() {
    rm -f ${GEM_HOME}/gems/chef-${PV}/spec/functional/assets/chefinittest
}

do_generate_spec_append() {
    # remove the rc2 suffix
    sed -i 's#1.1.0.rc2#1.1.0#g' ${GEM_SPEC_FILE}
}

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
