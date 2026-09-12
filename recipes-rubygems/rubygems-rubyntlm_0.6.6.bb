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

SRC_URI[md5sum] = "fba8572deb2f7c627fb7cd38a8027d20"
SRC_URI[sha256sum] = "1dab5d8b5c4f6f4c01b0878ba094f0aee5d8c197d0f03eaf43d5a176d66ab447"

GEM_NAME = "rubyntlm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
"

BBCLASSEXTEND = "native"
