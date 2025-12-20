# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-emoji"
DESCRIPTION = "[Emoji 17.0] Provides Unicode Emoji data and regexes, incorporating the latest Unicode and Emoji standards"
HOMEPAGE = "https://github.com/janlelis/unicode-emoji"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=92a470b2948f3b94ca06cdb8d9723330"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8bfbc40f9e59cdf2d6b2a1c3a2c253a4"
SRC_URI[sha256sum] = "519e69150f75652e40bf736106cfbc8f0f73aa3fb6a65afe62fefa7f80b0f80f"

GEM_NAME = "unicode-emoji"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
