# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=3dcdb500ebc9fc19d575024c9e60873d"

SRC_URI[md5sum] = "cae124aa2bde9284460d6dc30e2dac3b"
SRC_URI[sha256sum] = "b1bae3b70776fc81794da9e727a53b60c38715ad7839e24fe337de0ffec10cde"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
