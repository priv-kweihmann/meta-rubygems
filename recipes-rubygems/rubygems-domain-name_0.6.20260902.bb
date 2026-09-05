# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: domain_name"
DESCRIPTION = "This is a Domain Name manipulation library for Ruby.It can also be used for cookie domain validation based on the PublicSuffix List."
HOMEPAGE = "https://github.com/knu/ruby-domain_name"

LICENSE = "BSD-2-Clause AND BSD-3-Clause AND MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7721babccb76dfe86c736034209739e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ae67bd930728ea424162f31c7dc00d1f"
SRC_URI[sha256sum] = "4fac7f8e0a77dc85ec02f6534fdeff38e143d434ab8a86528fe68ca5bc45a042"

GEM_NAME = "domain_name"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
