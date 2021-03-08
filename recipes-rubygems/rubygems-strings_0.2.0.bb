# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: strings"
DESCRIPTION = "A set of methods for working with strings such as align, truncate, wrap and many more."
HOMEPAGE = "https://github.com/piotrmurach/strings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=45969ce099096fcbcda3634c24c5bb87"

DEPENDS_class-native += "\
    rubygems-strings-ansi-native \
    rubygems-unicode-display-width-native \
    rubygems-unicode-utils-native \
"

SRC_URI[md5sum] = "30a4400d19f94ac6ce28b8e3953c67bd"
SRC_URI[sha256sum] = "f578187c378dc304c8fd778923912f8ec8bcef40ed75dbd0ac5b5bc5eb07fc75"

GEM_NAME = "strings"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-strings-ansi \
    rubygems-unicode-display-width \
    rubygems-unicode-utils \
"

BBCLASSEXTEND = "native"
