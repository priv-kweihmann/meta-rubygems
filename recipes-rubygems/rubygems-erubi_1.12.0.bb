# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: erubi"
DESCRIPTION = "Erubi is a ERB template engine for ruby"
HOMEPAGE = "https://github.com/jeremyevans/erubi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=b96512a50183635e393096671fc79deb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI:append = " file://0001-erubi-fall-back-on-cgi-escape.patch"

SRC_URI[md5sum] = "92fa9ac9f48cce608153108e327d020d"
SRC_URI[sha256sum] = "27bedb74dfb1e04ff60674975e182d8ca787f2224f2e8143268c7696f42e4723"

GEM_NAME = "erubi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
