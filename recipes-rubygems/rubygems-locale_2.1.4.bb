# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: locale"
DESCRIPTION = "Ruby-Locale is the pure ruby library which provides basic APIs for localization."
HOMEPAGE = "https://github.com/ruby-gettext/locale"

LICENSE = "Ruby & LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=99f88e67b65504d289a0326c59f9c148"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c324a7f34b94044f8d38eabff159de62"
SRC_URI[sha256sum] = "522f9973ef3eee64aac9bca06d21db2fba675fa3d2cf61d21f42d1ca18a9f780"

GEM_NAME = "locale"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
