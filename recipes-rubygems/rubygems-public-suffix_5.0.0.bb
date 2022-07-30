# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: public_suffix"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, domain and subdomains."
HOMEPAGE = "https://simonecarletti.com/code/publicsuffix-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2a74ef4eea0924a177f516b68666a34f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9aaf1dfc519fdcaa08a8944a76002d01"
SRC_URI[sha256sum] = "26ee4fbce33ada25eb117ac71f2c24bf4d8b3414ab6b34f05b4708a3e90f1c6b"

GEM_NAME = "public_suffix"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
