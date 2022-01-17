# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby2_keywords"
DESCRIPTION = "Shim library for Module#ruby2_keywords"
HOMEPAGE = "https://github.com/ruby/ruby2_keywords"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4cf5ceb8f271a96fe2e4ab32bc1e828d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "89bc1e9231e63a0f93599772ae871e03"
SRC_URI[sha256sum] = "ffd13740c573b7301cf7a2e61fc857b2a8e3d3aff32545d6f8300d8bae10e3ef"

GEM_NAME = "ruby2_keywords"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
