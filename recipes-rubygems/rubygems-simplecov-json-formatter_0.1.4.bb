# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov_json_formatter"
DESCRIPTION = "JSON formatter for SimpleCov"
HOMEPAGE = "https://github.com/fede-moya/simplecov_json_formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=29;endline=29;md5=b493af919040007e469b1f3a8d33c774"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "875534b37a663975e2df584d525b7312"
SRC_URI[sha256sum] = "529418fbe8de1713ac2b2d612aa3daa56d316975d307244399fa4838c601b428"

GEM_NAME = "simplecov_json_formatter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
