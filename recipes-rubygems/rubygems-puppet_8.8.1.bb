# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet"
DESCRIPTION = "Puppet, an automated administrative engine for your Linux, Unix, and Windows systems, performs administrative tasks(such as adding users, installing packages, and updating server configurations) based on a centralized specification."
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
    rubygems-getoptlong-native \
    rubygems-locale-native \
    rubygems-multi-json-native \
    rubygems-puppet-resource-api-native \
    rubygems-scanf-native \
    rubygems-semantic-puppet-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2f039fa86f8bd02e1258bca40dcc9b6b"
SRC_URI[sha256sum] = "51733019f7f40fc985f916e89b289c481718c1a4a75edaba8b2dda61d5c4526c"

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
    rubygems-getoptlong \
    rubygems-locale \
    rubygems-multi-json \
    rubygems-puppet-resource-api \
    rubygems-scanf \
    rubygems-semantic-puppet \
"

BBCLASSEXTEND = "native"
