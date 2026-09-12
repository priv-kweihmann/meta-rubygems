# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: domain_name"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby.It can also be used for cookie domain validation based on the PublicSuffix List."
HOMEPAGE = "https://github.com/knu/ruby-domain_name"

LICENSE = "BSD-2-Clause AND BSD-3-Clause AND MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7721babccb76dfe86c736034209739e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "81fbeaec5c57c45ff7e96c342f9fe92f"
SRC_URI[sha256sum] = "5517a7f82c4464a61fc17133c3f6a02833faa13533c16c07e8f73b11d872cb03"

GEM_NAME = "domain_name"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
