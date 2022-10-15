# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday-net_http"
DESCRIPTION = "Faraday adapter for Net::HTTP"
HOMEPAGE = "https://github.com/lostisland/faraday-net_http"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=20830660ee48a0c845a62aad77c18f4a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "64876285d2f21b03bcfa9c7b4418229b"
SRC_URI[sha256sum] = "b8af469a5ad1024afd4857496ff55f2eef59b336c0cbb889531124deda09678d"

GEM_NAME = "faraday-net_http"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
