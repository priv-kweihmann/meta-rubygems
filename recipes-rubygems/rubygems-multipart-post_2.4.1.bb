# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multipart-post"
DESCRIPTION = "A multipart form post accessory for Net::HTTP."
HOMEPAGE = "https://github.com/socketry/multipart-post"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=18276da62cdadda4675dbf0abecf9c02"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "190a88b4cae633a46b64c30764e5d624"
SRC_URI[sha256sum] = "9872d03a8e552020ca096adadbf5e3cb1cd1cdd6acd3c161136b8a5737cdb4a8"

GEM_NAME = "multipart-post"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
