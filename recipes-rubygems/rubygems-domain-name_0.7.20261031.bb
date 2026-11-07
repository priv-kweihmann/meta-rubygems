# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: domain_name"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby.It can also be used for cookie domain validation based on the PublicSuffix List."
HOMEPAGE = "https://github.com/knu/ruby-domain_name"

LICENSE = "BSD-2-Clause AND BSD-3-Clause AND MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7721babccb76dfe86c736034209739e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5d7695835f3f3dd0d71f14de13cd4ad4"
SRC_URI[sha256sum] = "6091f1c2b4781302de49eefef9ebcfbd758b84279898ea8918d0a59fdc5c0cc9"

GEM_NAME = "domain_name"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
