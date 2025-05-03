# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: public_suffix"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, domain and subdomains."
HOMEPAGE = "https://simonecarletti.com/code/publicsuffix-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=36298970b89bc7acf9027b66b0dceb14"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0e193085b54f83fd56a3f7543b468076"
SRC_URI[sha256sum] = "bfa7cd5108066f8c9602e0d6d4114999a5df5839a63149d3e8b0f9c1d3558394"

GEM_NAME = "public_suffix"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
