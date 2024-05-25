# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: wisper"
DESCRIPTION = "A micro library providing objects with Publish-Subscribe capabilities.    Both synchronous (in-process) and asynchronous (out-of-process) subscriptions are supported.    Check out the Wiki for articles, guides and examples: https://github.com/krisleech/wisper/wiki"
HOMEPAGE = "https://github.com/krisleech/wisper"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=358;endline=380;md5=a89e7f76c3931794071d3def079169b7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "49b0f216a67a8602bbf7194b221ef5dd"
SRC_URI[sha256sum] = "02d0d4ad8c5c874d8d6410f3a163bda1ef517bc1b7302380b3e6ea4e143602db"

GEM_NAME = "wisper"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
