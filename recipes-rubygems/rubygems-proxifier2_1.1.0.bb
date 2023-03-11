# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: proxifier2"
DESCRIPTION = "Proxifier adds support for HTTP or SOCKS proxies and lets you force TCPSocket to use proxies."
HOMEPAGE = "https://github.com/chef/ruby-proxifier"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c2d0482cd15154f57d3779fde9532d2"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "aa1f44d4aaa9e11c4f5da1b41f00b276"
SRC_URI[sha256sum] = "030ed248a649c77f2ad640195f5c57c9f76e5c56a5c9fc0c52ca8ed97000b332"

GEM_NAME = "proxifier2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # Symlink so proxifier2 can act as a dropin replacement
    ln -sf ${GEM_NAME}-${GEM_VERSION} ${D}${GEM_DIR}/gems/proxifier-${GEM_VERSION}
    ln -sf ${GEM_NAME}-${GEM_VERSION}/${GEM_NAME}.gemspec ${D}${GEM_DIR}/gems/${GEM_NAME}-${GEM_VERSION}/proxifier.gemspec
    ln -sf ${GEM_NAME}-${GEM_VERSION}.gemspec ${D}${GEM_DIR}/specifications/proxifier-${GEM_VERSION}.gemspec
}

BBCLASSEXTEND = "native"
