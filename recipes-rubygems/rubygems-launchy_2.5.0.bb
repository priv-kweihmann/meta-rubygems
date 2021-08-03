# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: launchy"
DESCRIPTION = "Launchy is helper class for launching cross-platform applications in a fire and forget manner"
HOMEPAGE = "https://github.com/copiousfreetime/launchy"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=631319c3fb7bf218f4538f4c4d406090"

DEPENDS:class-native += "\
    rubygems-addressable-native \
"

SRC_URI[md5sum] = "598b4b3fa4d96173595a19e8287c9a93"
SRC_URI[sha256sum] = "954243c4255920982ce682f89a42e76372dba94770bf09c23a523e204bdebef5"

GEM_NAME = "launchy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
"

BBCLASSEXTEND = "native"
