# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: gems"
DESCRIPTION = "Ruby wrapper for the RubyGems.org API"
HOMEPAGE = "https://github.com/rubygems/gems"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=842ca4a33be30d4a5d5ea377568b309b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "06c4fa6dc82bc513b413382d9e78223b"
SRC_URI[sha256sum] = "37e7fb834365f39d3c2c649f0a7017288b0fe9ca69d3056b6760b53468b585ae"

GEM_NAME = "gems"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
