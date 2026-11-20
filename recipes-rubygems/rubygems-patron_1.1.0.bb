# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: patron"
DESCRIPTION = "Ruby HTTP client library based on libcurl"
HOMEPAGE = "https://github.com/toland/patron"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d7a84af80205b598ee5f47cab7eabb3"

EXTRA_DEPENDS:append = " curl"
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7c1bdf33e6bd517dbda1aaab5caf88d3"
SRC_URI[sha256sum] = "f4b69427c068349ca9607b83c08085fb0b7bd33a6269cf271c0e6c1ecbe8a91b"

GEM_NAME = "patron"

inherit rubygems
inherit rubygentest
inherit pkgconfig

rubygems_do_compile:prepend() {
    # Something is wrong with the easy_config generated code
    # patch in a static number to circumvent the check
    sed -i 's#found_num = try_constant("LIBCURL_VERSION_NUM", "curl/curlver.h")#found_num = 0x099999#g' ${S}/ext/patron/extconf.rb
}

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
