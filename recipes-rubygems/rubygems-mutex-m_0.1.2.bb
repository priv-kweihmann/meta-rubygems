# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mutex_m"
DESCRIPTION = "Mixin to extend objects to be handled like a Mutex."
HOMEPAGE = "https://github.com/ruby/mutex_m"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3a7bbf860e3757bf3d61f5dbb370856b"
SRC_URI[sha256sum] = "0a9bc5ebe3495e3fc39b1c56292792c1f793b3926fad050cd17b1272cfb57dde"

GEM_NAME = "mutex_m"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
