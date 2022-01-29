# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-mocks"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking"
HOMEPAGE = "https://github.com/rspec/rspec-mocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-diff-lcs-native \
    rubygems-rspec-support-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "95cee84b93b8f118d4193c7c19dc6d2e"
SRC_URI[sha256sum] = "d2f6f3d8b7569b1e846703d164cb23e24c7f530d38217fc06da2beaf6024260a"

GEM_NAME = "rspec-mocks"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-diff-lcs \
    rubygems-rspec-support \
"

BBCLASSEXTEND = "native"
