# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet"
DESCRIPTION = "Puppet, an automated configuration management tool"
HOMEPAGE = "https://github.com/puppetlabs/puppet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72bcf758cb771bfde198d175d9e48429"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-deep-merge-native \
    rubygems-facter-native \
    rubygems-fast-gettext-native \
    rubygems-hiera-native \
    rubygems-locale-native \
    rubygems-multi-json-native \
    rubygems-puppet-resource-api-native \
    rubygems-scanf-native \
    rubygems-semantic-puppet-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d776b039312b67e00f1b3b64790efebe"
SRC_URI[sha256sum] = "463699dd37d5fe3c7cdbd9ab6ceb5e031f6908f6567575689f2a76744ba2ef28"

GEM_NAME = "puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # remove stuff we don't really need
    # also avoid additional dependencies from
    # creeping in
    rm -rf ${GEM_HOME}/gems/puppet-${PV}/ext/debian/rules
    rm -rf ${GEM_HOME}/gems/puppet-${PV}/ext/gentoo/init.d/puppetmaster
    rm -rf ${GEM_HOME}/gems/puppet-${PV}/ext/solaris/smf/puppet
}

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-deep-merge \
    rubygems-facter \
    rubygems-fast-gettext \
    rubygems-hiera \
    rubygems-locale \
    rubygems-multi-json \
    rubygems-puppet-resource-api \
    rubygems-scanf \
    rubygems-semantic-puppet \
"

BBCLASSEXTEND = "native"
