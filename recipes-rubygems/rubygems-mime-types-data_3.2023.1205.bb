# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=de750349a19825baa21494a2b0e1f854"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ef597112cb238ef8f17113b41d09073a"
SRC_URI[sha256sum] = "8c4c79b29b03afdeb6a58c00ef0c5b856cf2371e2edc6cecf9ff33e9c7244a22"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
