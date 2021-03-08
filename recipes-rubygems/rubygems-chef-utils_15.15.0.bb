# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

SRC_URI[md5sum] = "199298cc599faf6eb5ba755297db4774"
SRC_URI[sha256sum] = "aaf3cbf01eb4b7f3900e2b3ecff82345e30c9cf285e6528e5711c96a188619c9"

GEM_NAME = "chef-utils"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
