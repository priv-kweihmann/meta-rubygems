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

SRC_URI[md5sum] = "f4e5edaac2b4fbca0f0da5dd5107f39a"
SRC_URI[sha256sum] = "8e2b84494fe89674e75170ecd5b9ca8d73c064101d7608d7b8709146bcbb82a1"

GEM_NAME = "rubyntlm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
"

BBCLASSEXTEND = "native"
