# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: trailblazer-option"
DESCRIPTION = "Wrap an option at compile-time and `call` it at runtime, which allows to have the common `-> ()`, `:method` or `Callable` pattern used for most options."
HOMEPAGE = "https://trailblazer.to/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=246c61a72af89fae27a4339662b56ee8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "610402f739531c4fb435912818bb5fec"
SRC_URI[sha256sum] = "20e4f12ea4e1f718c8007e7944ca21a329eee4eed9e0fa5dde6e8ad8ac4344a3"

GEM_NAME = "trailblazer-option"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
