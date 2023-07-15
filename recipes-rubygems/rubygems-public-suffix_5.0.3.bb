# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: public_suffix"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, domain and subdomains."
HOMEPAGE = "https://simonecarletti.com/code/publicsuffix-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=504283c730121689a2ad3523af9e4150"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1743f84d7d81c4f42b56ddcb1af39650"
SRC_URI[sha256sum] = "337d475da2bd2ea1de0446751cb972ad43243b4b00aa8cf91cb904fa593d3259"

GEM_NAME = "public_suffix"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
