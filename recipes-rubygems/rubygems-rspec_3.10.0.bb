# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec"
DESCRIPTION = "BDD for Ruby"
HOMEPAGE = "http://github.com/rspec"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d68fc2cfabf7ef564c5e9d537c8da05"

DEPENDS:class-native += "\
    rubygems-rspec-core-native \
    rubygems-rspec-expectations-native \
    rubygems-rspec-mocks-native \
"

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-core \
    rubygems-rspec-expectations \
    rubygems-rspec-mocks \
"

SRC_URI[md5sum] = "8d598e5805260025452c8f2233d53fb5"
SRC_URI[sha256sum] = "b870b43d49ae4a4e063b94976d2742b0854ec10458c425d569b5556ee5898ab7"

GEM_NAME = "rspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
