# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: httpclient"
DESCRIPTION = "gives something like the functionality of libwww-perl (LWP) in Ruby"
HOMEPAGE = "https://github.com/nahi/httpclient"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "\
    file://lib/httpclient/util.rb;beginline=4;endline=6;md5=f95668e0c05e0195fc9c95149ab4a296 \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " \
    ruby-rdoc \
"

SRC_URI:append = " \
    file://0001-httpclient-adapt-to-IRB-changes.patch \
"

DEPENDS:class-native += "\
    rubygems-mutex-m-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0cd6e72343dcd12699553689df61e671"
SRC_URI[sha256sum] = "8c10f65a5e618b9e1c37dc95fccec9e84953b74748257f65930c68c6f221a4ed"

GEM_NAME = "httpclient"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mutex-m \
"

BBCLASSEXTEND = "native"
