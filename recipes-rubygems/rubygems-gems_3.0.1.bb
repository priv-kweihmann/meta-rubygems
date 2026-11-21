# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: gems"
DESCRIPTION = "A client for the RubyGems.org API and compatible hosts, with immutable response objects, trusted publishing, and retries"
HOMEPAGE = "https://github.com/rubygems/gems"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=67f1f1b4fa9dc220dc7f86767d3490e9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e8bc69068cfda576dbdad37a2028173e"
SRC_URI[sha256sum] = "5f9f7fdc71db6d3e908cff25aed8f84b1bbad9bebea1b9b24c2ec24f215d80d5"

GEM_NAME = "gems"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
