# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: semantic_puppet"
DESCRIPTION = "Tools used by Puppet to parse, validate, and compare Semantic Versions and Version Ranges and to query and resolve module dependencies."
HOMEPAGE = "https://github.com/puppetlabs/semantic_puppet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8737b067d16e724769a2968ed8d6373f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "13e815fb348b7f34796caca591eb9a54"
SRC_URI[sha256sum] = "15ff5b48d7f856549eb66b927a8894d3668b211970c9d7dc07dd4db57f5c7a96"

GEM_NAME = "semantic_puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
