# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multipart-post"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
HOMEPAGE = "https://github.com/socketry/multipart-post"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lib/net/http/post/multipart.rb;beginline=5;endline=21;md5=7f7c2007e48f6b5170afcdeeda85abc0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "487ba29eef18022a162d6dd098136cd1"
SRC_URI[sha256sum] = "9452908cb6afaa2f5b05500801ee8441210b2adb92fc3df30da23a5a80c4f18d"

GEM_NAME = "multipart-post"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
