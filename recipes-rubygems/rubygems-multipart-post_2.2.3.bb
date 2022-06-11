# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multipart-post"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
HOMEPAGE = "https://github.com/socketry/multipart-post"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lib/net/http/post/multipart.rb;beginline=5;endline=21;md5=7f7c2007e48f6b5170afcdeeda85abc0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ebcd6ee70446d58c85ceb926f664a883"
SRC_URI[sha256sum] = "462979de2971b8df33c2ee797fd497731617241f9dcd93960cc3caccb2dd13d8"

GEM_NAME = "multipart-post"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
