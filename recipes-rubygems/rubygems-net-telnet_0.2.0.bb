# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-telnet"
DESCRIPTION = "Provides telnet client functionality."
HOMEPAGE = "https://github.com/ruby/net-telnet"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=837b32593517ae48b9c3b5c87a5d288c"

SRC_URI[md5sum] = "ec48f3b00d2414b81642c60b55ab5f37"
SRC_URI[sha256sum] = "253007c0f8dc3fd66e569d53ebbce5ef6e94d6246ab9c04d73a7629b0eebd39a"

GEM_NAME = "net-telnet"

EXTRA_RDEPENDS:append = " bash"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
