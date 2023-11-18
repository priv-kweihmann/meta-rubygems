# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: domain_name"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby.It can also be used for cookie domain validation based on the PublicSuffix List."
HOMEPAGE = "https://github.com/knu/ruby-domain_name"

LICENSE = "BSD-2-Clause & BSD-3-Clause & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7721babccb76dfe86c736034209739e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "69d5ea358e9f997b8b144933e11fd9c0"
SRC_URI[sha256sum] = "5127a1521ecca79d54accefc393f6d19db8600c6224416004414f7eaa28aecbe"

GEM_NAME = "domain_name"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
