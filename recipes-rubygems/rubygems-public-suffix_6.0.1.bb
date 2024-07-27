# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: public_suffix"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, domain and subdomains."
HOMEPAGE = "https://simonecarletti.com/code/publicsuffix-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4c532fd2136825efffd71dd019e3dc91"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "12ec93094a3467364c8c6ee5a6e8325a"
SRC_URI[sha256sum] = "61d44e1cab5cbbbe5b31068481cf16976dd0dc1b6b07bd95617ef8c5e3e00c6f"

GEM_NAME = "public_suffix"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
