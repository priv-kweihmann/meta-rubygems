# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: locale"
DESCRIPTION = "Ruby-Locale is the pure ruby library which provides basic APIs for localization."
HOMEPAGE = "https://github.com/ruby-gettext/locale"

LICENSE = "Ruby & LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=99f88e67b65504d289a0326c59f9c148"

SRC_URI[md5sum] = "f5bef9eed8e8c40417a3ab68fa34f477"
SRC_URI[sha256sum] = "b6ddee011e157817cb98e521b3ce7cb626424d5882f1e844aafdee3e8b212725"

GEM_NAME = "locale"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
