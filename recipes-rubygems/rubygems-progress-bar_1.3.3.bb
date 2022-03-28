# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: progress_bar"
DESCRIPTION = "Give people feedback about long-running tasks without overloading them with information: Use a progress bar, like Curl or Wget!"
HOMEPAGE = "http://github.com/paul/progress_bar"

LICENSE = "WTFPL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c79afcc5a5e0f48a4a5a5687a026b3e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-highline-native \
    rubygems-options-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c779cd919a7133d68a3f0703fd156e85"
SRC_URI[sha256sum] = "873018c6c94a2c33c9d10109719c14d6004d3bbd4d385691fba9c9560b347b12"

GEM_NAME = "progress_bar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-highline \
    rubygems-options \
"

BBCLASSEXTEND = "native"
