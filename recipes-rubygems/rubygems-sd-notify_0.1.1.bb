# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sd_notify"
DESCRIPTION = "sd_notify can be used to notify systemd about various service status changes of Ruby programs"
HOMEPAGE = "https://github.com/agis/ruby-sdnotify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b77c216298aab2ea0d2a7f0835f42763"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e044ef68e5c786b44f56cb2dd88e545b"
SRC_URI[sha256sum] = "cbc7ac6caa7cedd26b30a72b5eeb6f36050dc0752df263452ea24fb5a4ad3131"

GEM_NAME = "sd_notify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
