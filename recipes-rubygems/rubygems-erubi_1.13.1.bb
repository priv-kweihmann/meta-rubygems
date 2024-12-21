# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: erubi"
DESCRIPTION = "Erubi is a ERB template engine for ruby"
HOMEPAGE = "https://github.com/jeremyevans/erubi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=b96512a50183635e393096671fc79deb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

SRC_URI:append = " \
    file://0001-erubi-fall-back-on-cgi-escape.patch \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2ca752e90652b2fa07b803af833abae6"
SRC_URI[sha256sum] = "a082103b0885dbc5ecf1172fede897f9ebdb745a4b97a5e8dc63953db1ee4ad9"

GEM_NAME = "erubi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
