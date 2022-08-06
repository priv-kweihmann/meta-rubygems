# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: erubi"
DESCRIPTION = "Erubi is a ERB template engine for ruby"
HOMEPAGE = "https://github.com/jeremyevans/erubi"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=b96512a50183635e393096671fc79deb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "42f1f27ca9b70754f1eee09b761d5672"
SRC_URI[sha256sum] = "fda72d577feaf3bdcd646d33fa630be5f92f48e179a9278e4175a9cec20e7f85"

GEM_NAME = "erubi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
