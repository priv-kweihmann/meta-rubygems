# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http-accept"
DESCRIPTION = "Parse Accept and Accept-Language HTTP headers."
HOMEPAGE = "https://github.com/ioquatix/http-accept"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=46bdd4fdbcc0fcefa757bbd1bf912838"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bdd2f1c5346da6fd0a3884db5a027b7b"
SRC_URI[sha256sum] = "f8481ded20f782e43555f5c6b20222449fff4e5322462721c79c056b89ad500f"

GEM_NAME = "http-accept"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
