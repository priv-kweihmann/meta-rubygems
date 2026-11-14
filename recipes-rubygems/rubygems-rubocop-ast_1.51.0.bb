# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop-ast"
DESCRIPTION = "RuboCop's Node and NodePattern classes."
HOMEPAGE = "https://www.rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=04ca7628e4fc69bcdd742603357bdfa6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-parser-native \
    rubygems-prism-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3ffe815660a1f77bfcafc5cdf305666d"
SRC_URI[sha256sum] = "0ec311e36b191b3872d909078a35274e962ae97dbce64be6812d145ca59acfcb"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
    rubygems-prism \
"

BBCLASSEXTEND = "native"
