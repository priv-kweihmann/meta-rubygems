# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f52d975a35e063d5618428d09cc4e12f"
SRC_URI[sha256sum] = "654da693df23a8dcf26ea4b390c98225b094370eb82e2e09aec191fca639ac31"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
