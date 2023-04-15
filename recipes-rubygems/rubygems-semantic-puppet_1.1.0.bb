# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: semantic_puppet"
DESCRIPTION = "Tools used by Puppet to parse, validate, and compare Semantic Versions and Version Ranges and to query and resolve module dependencies."
HOMEPAGE = "https://github.com/puppetlabs/semantic_puppet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8737b067d16e724769a2968ed8d6373f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0042f4e83fbf7435f4425070d81efd9e"
SRC_URI[sha256sum] = "52d108d08e1a5d95c00343cb3a4936fb1deecff2be612ec39c9cb66be5a8b859"

GEM_NAME = "semantic_puppet"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
