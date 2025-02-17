# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: lint_roller"
DESCRIPTION = "A plugin specification for linter and formatter rulesets"
HOMEPAGE = "https://github.com/standardrb/lint_roller"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=62a1dbb309f8874e88d2119119c0c960"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "afaf4eb39bafaf36a765a9772105eb1e"
SRC_URI[sha256sum] = "2c0c845b632a7d172cb849cc90c1bce937a28c5c8ccccb50dfd46a485003cc87"

GEM_NAME = "lint_roller"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
