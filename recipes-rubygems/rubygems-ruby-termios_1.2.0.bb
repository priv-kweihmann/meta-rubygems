# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby-termios"
DESCRIPTION = "Termios module is simple wrapper of termios(3).It can be included into IO-family classes and can extend IO-family objects.In addition, the methods can use as module function."
HOMEPAGE = "https://github.com/arika/ruby-termios"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0 \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d4371488987706a2c35d72b7d58c6f83"
SRC_URI[sha256sum] = "1f00672827b526e9ba2162962a39bc1efe26e80ac1d49b77cd48f5c0f37b6604"

GEM_NAME = "ruby-termios"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
