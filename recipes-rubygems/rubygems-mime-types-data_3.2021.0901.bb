# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=3dcdb500ebc9fc19d575024c9e60873d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "545ab42031ae3f8c0bbb4a6a930d86a8"
SRC_URI[sha256sum] = "bbf3ccee18705de9c2644ce1cd9738b5709ca3cbc1f603e50c9a9388cddcbcfc"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
