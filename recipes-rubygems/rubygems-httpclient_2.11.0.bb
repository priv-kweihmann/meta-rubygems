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

SRC_URI[md5sum] = "e2fa6632665860ee057ba581c5e920e5"
SRC_URI[sha256sum] = "9ebadb93fa2815f1916932546db49dc03e85902af04deb2c4a6ddf7bbd54ea89"

GEM_NAME = "httpclient"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-mutex-m \
"

BBCLASSEXTEND = "native"
