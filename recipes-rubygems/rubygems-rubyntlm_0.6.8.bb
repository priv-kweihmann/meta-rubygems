# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyntlm"
DESCRIPTION = "Ruby/NTLM provides message creator and parser for the NTLM authentication."
HOMEPAGE = "https://github.com/winrb/rubyntlm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1abaf55929270cb01e40abca2d29984f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5d59a403da3a999ea567603c03302424"
SRC_URI[sha256sum] = "054aa45ffcae40db4020d3e41da41f40427aa8733181a2b87751f04ba53ca0d5"

GEM_NAME = "rubyntlm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
"

BBCLASSEXTEND = "native"
