# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: locale"
DESCRIPTION = "Ruby-Locale is the pure ruby library which provides basic APIs for localization."
HOMEPAGE = "https://github.com/ruby-gettext/locale"

LICENSE = "Ruby & LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=99f88e67b65504d289a0326c59f9c148"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-fiddle-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f0c4967ac00bd5975df35c57ab059d6b"
SRC_URI[sha256sum] = "1c6803e8aa6bdb2c29e91945d095050601bf6d58474993575adf6f3b89b32ef4"

GEM_NAME = "locale"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-fiddle \
"

BBCLASSEXTEND = "native"
