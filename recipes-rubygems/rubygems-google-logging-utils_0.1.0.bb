# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-logging-utils"
DESCRIPTION = "Utility classes for logging to Google Cloud Logging"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "150a6f20601f0b7852817fb43c52fb1c"
SRC_URI[sha256sum] = "70950b1e49314273cf2e167adb47b62af7917a4691b580da7e9be67b9205fcd5"

GEM_NAME = "google-logging-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
