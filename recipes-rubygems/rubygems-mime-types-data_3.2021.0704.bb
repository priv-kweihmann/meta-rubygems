# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=3dcdb500ebc9fc19d575024c9e60873d"

SRC_URI[md5sum] = "64ddfa0344d099ac1b95a222a868e456"
SRC_URI[sha256sum] = "9ecd5aa031d5483156cd7a4e7d1956881d75f7ed8c08d487900df8580ee39d36"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
