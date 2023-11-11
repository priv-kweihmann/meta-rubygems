# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mutex_m"
DESCRIPTION = "Mixin to extend objects to be handled like a Mutex."
HOMEPAGE = "https://github.com/ruby/mutex_m"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b263006d86b0d057392d1d6d9b60fbcd"
SRC_URI[sha256sum] = "b6ef0c6c842ede846f2ec0ade9e266b1a9dac0bc151682b04835e8ebd54840d5"

GEM_NAME = "mutex_m"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
