# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: public_suffix"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, domain and subdomains."
HOMEPAGE = "https://simonecarletti.com/code/publicsuffix-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4c532fd2136825efffd71dd019e3dc91"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b0ffac71adde79d4485441ad2ed0b53f"
SRC_URI[sha256sum] = "d2c8e12e076813f8fca0307205c088c6903adc70b92c65ab22479dfa9bc0a89e"

GEM_NAME = "public_suffix"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
