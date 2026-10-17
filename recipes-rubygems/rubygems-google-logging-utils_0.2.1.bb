# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-logging-utils"
DESCRIPTION = "Utility classes for logging to Google Cloud Logging"
HOMEPAGE = "https://github.com/googleapis/ruby-core-libraries"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "579b5b733309e1d484ac448e03b2010e"
SRC_URI[sha256sum] = "73945c3ac6800eba802c26b1744765d5057cc4d89182c7255ee1347b0ca96dc7"

GEM_NAME = "google-logging-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
