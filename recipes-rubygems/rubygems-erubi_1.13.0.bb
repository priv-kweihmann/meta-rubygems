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

SRC_URI[md5sum] = "ebcea152a605001af22d9899a57087f7"
SRC_URI[sha256sum] = "fca61b47daefd865d0fb50d168634f27ad40181867445badf6427c459c33cd62"

GEM_NAME = "erubi"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
