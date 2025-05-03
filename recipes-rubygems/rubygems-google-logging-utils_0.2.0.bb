# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-logging-utils"
DESCRIPTION = "Utility classes for logging to Google Cloud Logging"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d2173c2a293c6dcce04730024b9de800"
SRC_URI[sha256sum] = "675462b4ea5affa825a3442694ca2d75d0069455a1d0956127207498fca3df7b"

GEM_NAME = "google-logging-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
