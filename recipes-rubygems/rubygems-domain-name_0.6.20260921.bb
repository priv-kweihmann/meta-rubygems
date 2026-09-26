# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: domain_name"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby.It can also be used for cookie domain validation based on the PublicSuffix List."
HOMEPAGE = "https://github.com/knu/ruby-domain_name"

LICENSE = "BSD-2-Clause AND BSD-3-Clause AND MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7721babccb76dfe86c736034209739e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "109aa89acbe3473bf27a9d14743bc72a"
SRC_URI[sha256sum] = "b335949f69fae603fed0ae88c4e09a51e9d8e3ceef4c73a6cfde44eb5c8dee6d"

GEM_NAME = "domain_name"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
