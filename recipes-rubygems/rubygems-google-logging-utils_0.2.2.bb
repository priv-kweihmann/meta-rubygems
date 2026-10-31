# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-logging-utils"
DESCRIPTION = "Utility classes for logging to Google Cloud Logging"
HOMEPAGE = "https://github.com/googleapis/ruby-core-libraries"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3cc5a195c666c148ac8b0f55c379a3a9"
SRC_URI[sha256sum] = "ad2436ef22e918e2b1c3ad2bbaf5949f42f5389d49fd37e41b43bbdd3068e27c"

GEM_NAME = "google-logging-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
