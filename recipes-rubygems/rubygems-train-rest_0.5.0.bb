# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: train-rest"
DESCRIPTION = "Provides a transport to communicate easily with RESTful APIs."
HOMEPAGE = "https://github.com/tecracer-chef/train-rest"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sigv4-native \
    rubygems-rest-client-native \
    rubygems-train-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ea1610f20d1c717e766222668da389e9"
SRC_URI[sha256sum] = "63dcabb396022570cf1f21a3e77b2f64a8b3a85179a0b6e2be91a6fff9268a63"

GEM_NAME = "train-rest"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sigv4 \
    rubygems-rest-client \
    rubygems-train-core \
"

BBCLASSEXTEND = "native"
