# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: strings"
DESCRIPTION = "A set of methods for working with strings such as align, truncate, wrap and many more."
HOMEPAGE = "https://github.com/piotrmurach/strings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=45969ce099096fcbcda3634c24c5bb87"

DEPENDS:class-native += "\
    rubygems-strings-ansi-native \
    rubygems-unicode-display-width-native \
    rubygems-unicode-utils-native \
"

SRC_URI[md5sum] = "d7ba6cdc31aff7b502f12faed2bd4738"
SRC_URI[sha256sum] = "933293b3c95cf85b81eb44b3cf673e3087661ba739bbadfeadf442083158d6fb"

GEM_NAME = "strings"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-strings-ansi \
    rubygems-unicode-display-width \
    rubygems-unicode-utils \
"

BBCLASSEXTEND = "native"
