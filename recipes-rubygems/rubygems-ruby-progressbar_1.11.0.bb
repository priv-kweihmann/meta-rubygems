# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby-progressbar"
DESCRIPTION = "Ruby/ProgressBar is an extremely flexible text progress bar library for Ruby"
HOMEPAGE = "https://github.com/jfelchner/ruby-progressbar"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5dfde5e6b899242178fcfd8ca5fee9bc"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ab2638003880a34034136b7dcc9080ef"
SRC_URI[sha256sum] = "cc127db3866dc414ffccbf92928a241e585b3aa2b758a5563e74a6ee0f57d50a"

GEM_NAME = "ruby-progressbar"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
