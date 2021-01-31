# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mime-types-data"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media typedefinitions"
HOMEPAGE = "https://github.com/mime-types/mime-types-data/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Licence.md;md5=3dcdb500ebc9fc19d575024c9e60873d"

DEPENDS_class-native += ""
RDEPENDS_${PN}_class-target += ""

SRC_URI[md5sum] = "296a95a186a2bf206ca272e06757f632"
SRC_URI[sha256sum] = "4fb1eeb8e3fbe88059c751adc6a96322b8f2c89403db8928bb9bda64b9f3f246"

GEM_NAME = "mime-types-data"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
