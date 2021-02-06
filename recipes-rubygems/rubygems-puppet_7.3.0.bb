# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet"
DESCRIPTION = "Puppet, an automated configuration management tool"
HOMEPAGE = "https://github.com/puppetlabs/puppet"

LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72bcf758cb771bfde198d175d9e48429"

DEPENDS_class-native += "\
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
RDEPENDS_${PN}_class-target += "\
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

SRC_URI[md5sum] = "82857bbc5a75c3b6e49ce15c18959504"
SRC_URI[sha256sum] = "5940b5726818acb0de952be52ce77a9f270a5ab2df0fab8f2ce7f5d4f39b32cc"

GEM_NAME = "puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
