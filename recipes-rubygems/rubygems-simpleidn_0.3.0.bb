# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simpleidn"
DESCRIPTION = "This gem allows easy conversion from punycode ACE strings to unicode UTF-8 strings and vice-versa."
HOMEPAGE = "https://github.com/mmriis/simpleidn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=40b5340dd69188c312d188f6250e23f0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7dfff7f31931a76781cb1054bae8a46d"
SRC_URI[sha256sum] = "12ca730bed2f3db04d11e9bfd1bca3e11fb37f55b21eb2e9793fb5814bf54d03"

GEM_NAME = "simpleidn"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
