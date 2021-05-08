# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: simplecov_json_formatter"
DESCRIPTION = "JSON formatter for SimpleCov"
HOMEPAGE = "https://github.com/fede-moya/simplecov_json_formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

SRC_URI[md5sum] = "9fbe5ca0e02a9c5ac6078598b00d782a"
SRC_URI[sha256sum] = "54de803c32187e0c079c5d93fe013d14c18ecaa28e655ddde95214b83d2c21a7"

GEM_NAME = "simplecov_json_formatter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
