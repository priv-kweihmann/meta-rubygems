# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=3dcdb500ebc9fc19d575024c9e60873d"

SRC_URI[md5sum] = "f21ab7d956549b7a99fc97166853a48a"
SRC_URI[sha256sum] = "20b0a527f669c66d51d531746c4c0cccd709ab2c7316976e7e8931a7996819f1"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
